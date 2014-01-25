package sagex.remote.media;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.RandomAccess;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.sageplugins.sagexmlinfo.MediaFile;
import sagex.api.AiringAPI;
import sagex.api.MediaFileAPI;
import sagex.remote.SagexServlet;
import sagex.util.ILog;
import sagex.util.LogProvider;

//Status Code: 206
//Header: null=HTTP/1.1 206 (Partial Content)
//Header: Accept-Ranges=bytes
//Header: Connection=close
//Header: Content-Length=250000
//Header: Content-Range=bytes 5076471732-5076721731/5076721732
//Header: Content-Type=application/octet-stream
//Header: Date=Sat, 18 Jan 2014 22:20:05 GMT
//Header: ETag="6ead47e148f2a26eef9318f6cb9801e70d5340b79.ts"
//Header: Last-Modified=Sun, 30 Sep 2012 10:25:40 GMT
//Header: Server=nginx/1.2.5

public class MediaFileRequestHandler implements SageMediaRequestHandler {
	public static final Map<String,String> MimeTypes = new HashMap<String,String>();
	static {
		MimeTypes.put("ts", "video/MP2T");
		MimeTypes.put("avi", "video/x-msvideo");
		MimeTypes.put("mp4", "video/mp4");
		MimeTypes.put("mkv", "video/x-matroska");
		MimeTypes.put("mov", "video/quicktime");
		MimeTypes.put("flv", "video/x-flv");
		MimeTypes.put("m3u8", "application/x-mpegURL");
	}
	
	private static final String ARG_SEGLENGTH = "segment";
	
	ILog log = LogProvider.getLogger(this.getClass());

	public String getMimeType(File file, String defaultMime) {
		return getMimeType(parseFileExtension(file).toLowerCase(), defaultMime);
	}

	public String getMimeType(String ext, String defaultMime) {
		String mime = MimeTypes.get(ext);
		if (mime==null) {
			mime=defaultMime;
		}
		return mime;
	}
	
	public String formatDate(long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
		return dateFormat.format(calendar.getTime());		
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object sagefile) throws Exception {
		if (req.getAttribute(MediaHandler.MEDIA_M3U_ATTRIBUTE)!=null) {
			processM3U(req, resp, sagefile);
			return;
		}
		
		
		// get the media file that we are going to be using
		File file = MediaFileAPI.GetFileForSegment(sagefile, getMediaSegment(req));

		if (file == null || !file.exists()) {
			// TODO: This happens because it's looking for
			// subtitle files... need to handle subtitles at some point.
			
			log.info("MediaFile not found for " + req.getPathInfo());
			resp.sendError(404, "File not found");
			return;
		}

		// check for a range request
		String range = req.getHeader("Range");
		if (range != null && range.trim().length() > 0) {
			log.debug("Processing Rang Request: " + range);
			doRangeRequest(file, req, resp, sagefile, getRanges(range, file.length()));
		} else {
			doNormalRequest(file, req, resp, sagefile);
		}
	}

	private int getMediaSegment(HttpServletRequest req) {
		if (req.getAttribute(MediaHandler.MEDIA_SEGMENT_ATTRIBUTE)!=null) {
			return Integer.parseInt((String) req.getAttribute(MediaHandler.MEDIA_SEGMENT_ATTRIBUTE));
		}
		return 0;
	}

	/**
	 * splits a files into pseudo seglen (seconds) chunks for hsl streaming.  This is not
	 * exact, and is simply an estimate in how it splits
	 * @param req
	 * @param resp
	 * @param sagefile
	 * @param seglen
	 * @throws IOException
	 */
	private void processM3U(HttpServletRequest req, HttpServletResponse resp, Object sagefile, int seglen) throws IOException {
		File[] files=MediaFileAPI.GetSegmentFiles(sagefile);
		
//		#EXTM3U
//		#EXT-X-PLAYLIST-TYPE:VOD
//		#EXT-X-TARGETDURATION:10
//		#EXT-X-VERSION:3
//		#EXT-X-MEDIA-SEQUENCE:0
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceA.ts		
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceB.ts
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceC.ts
//		#EXTINF:9.0,
//		http://example.com/movie1/fileSequenceD.ts
//		#EXT-X-ENDLIST		

		int mfid = MediaFileAPI.GetMediaFileID(sagefile);
	
		StringBuilder sb = new StringBuilder();
		sb.append("#EXTM3U\r\n");
		sb.append("#EXT-X-PLAYLIST-TYPE:VOD\r\n");
		sb.append("#EXT-X-TARGETDURATION:"+seglen+"\r\n");
		sb.append("#EXT-X-MEDIA-SEQUENCE:0\r\n");
		// for range headers
		sb.append("#EXT-X-VERSION:4\r\n");
		for (int i=0;i<files.length;i++) {
			String mfpart = getOrigUrl(req) +String.valueOf(mfid)+ "/"+String.valueOf(i)+"/" + String.valueOf(i);
			if (req.getAttribute(SagexServlet.DEBUG_ATTRIBUTE)!=null) {
				mfpart = (mfpart + ".debug."+parseFileExtension(files[i]));	
			} else {
				mfpart = (mfpart + "."+parseFileExtension(files[i]));
			}			
			long segs = (MediaFileAPI.GetDurationForSegment(sagefile, i)/1000)/seglen;
			long segbytes = files[i].length()/segs;
			for (int k=0;k<segs;k++) {
				sb.append("#EXTINF:" + seglen + ".0,no desc\r\n");
				sb.append("#EXT-X-BYTERANGE:"+String.valueOf(segbytes)+"@"+String.valueOf(k*segbytes)+"\r\n");
				sb.append(mfpart + "\r\n");
			}
			log.debug("Created " + segs + " segments for file " + files[i]);
		}
		sb.append("#EXT-X-ENDLIST\r\n");
		
//		resp.setHeader("Accept-Ranges", "bytes");
		resp.setHeader("Connection", "close");
		
		resp.setContentLength(sb.length());
		resp.setContentType(getMimeType("m3u8", "audio/mpegurl"));
		
		log.debug("\r\n" + sb.toString());
		
		resp.getWriter().write(sb.toString());
		resp.flushBuffer();
	}
	
	
	private void processM3U(HttpServletRequest req, HttpServletResponse resp,
			Object sagefile) throws IOException {

		File[] files=MediaFileAPI.GetSegmentFiles(sagefile);
		
		if (req.getParameter(ARG_SEGLENGTH)!=null) {
			processM3U(req, resp, sagefile, Integer.parseInt(req.getParameter(ARG_SEGLENGTH)));
			return;
		}
		
//		#EXTM3U
//		fileSequenceA.ts
//		#EXT-X-ENDLIST
		
//		#EXTM3U
//		#EXT-X-PLAYLIST-TYPE:VOD
//		#EXT-X-TARGETDURATION:10
//		#EXT-X-VERSION:3
//		#EXT-X-MEDIA-SEQUENCE:0
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceA.ts		
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceB.ts
//		#EXTINF:10.0,
//		http://example.com/movie1/fileSequenceC.ts
//		#EXTINF:9.0,
//		http://example.com/movie1/fileSequenceD.ts
//		#EXT-X-ENDLIST		
		
		int mfid = MediaFileAPI.GetMediaFileID(sagefile);
		
		StringBuilder sb = new StringBuilder();
		sb.append("#EXTM3U\r\n");
		sb.append("#EXT-X-PLAYLIST-TYPE:VOD\r\n");
		sb.append("#EXT-X-TARGETDURATION:"+getDurationInSeconds(sagefile)+"\r\n");
		// eventually for range headers
		sb.append("#EXT-X-VERSION:4\r\n");
		sb.append("#EXT-X-MEDIA-SEQUENCE:0\r\n");
		for (int i=0;i<files.length;i++) {
			String mfpart = getOrigUrl(req) +String.valueOf(mfid)+ "/"+String.valueOf(i)+"/" + String.valueOf(i);
			sb.append("#EXTINF:" + getDurationInSeconds(sagefile, i) + ".0,no desc\r\n");
			if (req.getAttribute(SagexServlet.DEBUG_ATTRIBUTE)!=null) {
				sb.append(mfpart + ".debug."+parseFileExtension(files[i])+"\r\n");	
			} else {
				sb.append(mfpart + "."+parseFileExtension(files[i])+"\r\n");
			}
		}
		sb.append("#EXT-X-ENDLIST\r\n");
		
		resp.setHeader("Accept-Ranges", "bytes");
//		resp.setHeader("Connection", "close");
		
		resp.setContentLength(sb.length());
		resp.setContentType(getMimeType("m3u8", "audio/mpegurl"));
		
		log.debug("\r\n" + sb.toString());
		
		resp.getWriter().write(sb.toString());
		resp.flushBuffer();
	}
	
	public static String getOrigUrl(HttpServletRequest req) {
	    String scheme = req.getScheme();             // http
	    String serverName = req.getServerName();     // hostname.com
	    int serverPort = req.getServerPort();        // 80
	    String contextPath = req.getContextPath();   // /mywebapp
	    String servletPath = req.getServletPath();   // /servlet/MyServlet
	    String pathInfo = req.getPathInfo();         // /a/b;c=123
	    String queryString = req.getQueryString();          // d=789
	 
	    // Reconstruct original requesting URL
	    String url = scheme+"://"+serverName+":"+serverPort+"/sagex/media/mediafile/";
	    
	    return url;
	}
	
	private String parseFileExtension(File file) {
		int i = file.getName().lastIndexOf('.');
		if (i >= 0) {
		    return file.getName().substring(i+1);
		} else {
			return "";
		}
	}

	private long getDurationInSeconds(Object sagefile, int i) {
		return MediaFileAPI.GetDurationForSegment(sagefile, i)/1000;
	}

	private long getDurationInSeconds(Object sagefile) {
		return AiringAPI.GetAiringDuration(sagefile)/1000;
	}

	public void doRangeRequest(File file, HttpServletRequest req, HttpServletResponse resp, Object sagefile, long[] ranges)
			throws IOException {
		doRangeRequestWithStatus(file, req, resp, sagefile, ranges);
	}

	public void setHeader(HttpServletResponse resp, String header, String value, HttpServletRequest req) {
		resp.addHeader(header, value);
		if (req.getAttribute(SagexServlet.DEBUG_ATTRIBUTE)!=null) {
			log.debug("RESP HEADER: " + header + "=" + value);
		}
	}
	
	public void doRangeRequestWithStatus(File file, HttpServletRequest req, HttpServletResponse resp, Object sagefile, long[] ranges)
			throws IOException {
		
		setHeader(resp, "Accept-Ranges", "bytes", req);
		setHeader(resp, "Connection", "keep-alive", req);
		setHeader(resp, "Date", formatDate(System.currentTimeMillis()), req);
		setHeader(resp, "Last-Modified", formatDate(file.lastModified()), req);
		setHeader(resp, "X-Content-Duration", String.valueOf(getDurationInSeconds(sagefile, getMediaSegment(req))) + ".0", req);
		
		if (MediaFileAPI.IsMusicFile(sagefile)) {
			setHeader(resp, "Content-Type","audio/mpeg", req);
		} else if (MediaFileAPI.IsPictureFile(sagefile)) {
			setHeader(resp, "Content-Type","image/jpeg", req);
		} else {
			setHeader(resp, "Content-Type", getMimeType(file, "application/octet-stream"), req);
		}

		String forceMime = req.getParameter("force-mime");
		if (forceMime != null && forceMime.length() > 0) {
			setHeader(resp, "Content-Type", forceMime, req);						
		}
		
		boolean rangeRequest = false;
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		try {
			if (ranges==null) {
				resp.setStatus(200);
				ranges = new long[] {0, file.length()-1};
				rangeRequest=false;
			} else {
				resp.setStatus(206);
				rangeRequest=true;
			}
			
			raf.seek(ranges[0]);
			FileInputStream fis = new FileInputStream(raf.getFD());
			long size = ranges[1] - ranges[0] + 1;
			setHeader(resp, "Content-Length", String.valueOf(size), req);
			
			if (rangeRequest) {
				String contentRange = "bytes "+String.valueOf(ranges[0])+"-"+String.valueOf((ranges[1]))+"/"+String.valueOf(file.length());
				setHeader(resp, "Content-Range", contentRange, req);
			}
			
			long counted = 0;
			int bufSize = (int) Math.min(size, 64 * 1024);
			byte[] buf = new byte[bufSize];
			int curRead = 0;
			if (rangeRequest) {
				log.debug("beginning range ["+String.valueOf(ranges[0]) + " - " + String.valueOf(ranges[1]) + "] with size: " + size + "; bufsize: " + bufSize + " for file " + file);
			} else {
				log.debug("Sending entire file (" + size +" bytes) for file " + file);
			}
			
			long logticker = 10000;
			
			OutputStream os = resp.getOutputStream();
			long logit = System.currentTimeMillis()+logticker;
			while (counted < size) {
				curRead = fis.read(buf, 0, (int) Math.min(bufSize, size - counted));
				if (curRead == 0 || curRead == -1)
					break;
				counted += curRead;
				os.write(buf, 0, curRead);
				os.flush();
				if (System.currentTimeMillis()>logit) {
					log.debug("Still Streaming: " + file + "; " + String.valueOf(counted));
					logit = System.currentTimeMillis()+logticker;
				}
			}
			os.flush();
			fis.close();
			//os.close();
			log.debug("Finished normal range stream for file " + file + "; processed " + counted + " bytes");
		} catch (IOException e) {
			log.warn("IOError ("+ file+ "): " + e.getMessage(), e);
		} catch (Throwable t) {
			log.warn("Range Stream Error for " + file, t);
		} finally {
			log.debug("Finished Range for file " + file);
			if (raf != null) {
				raf.close();
			}
		}
	}

	public long[] getRanges(String rangeHeader, long fileLength) {
		if (rangeHeader == null)
			return null;
		rangeHeader = rangeHeader.trim();
		String bytes = rangeHeader.substring(rangeHeader.indexOf('=') + 1);
		if (bytes.length() == 0) {
			return new long[] { 0, fileLength-1 };
		}
		if (bytes.startsWith("-")) {
			return new long[] { 0, Long.valueOf(bytes.substring(1)) };
		} else if (bytes.endsWith("-")) {
			return new long[] { Long.valueOf(bytes.substring(0, bytes.length() - 1)), fileLength-1 };
		} else {
			int pos = bytes.indexOf("-");
			return new long[] { Long.valueOf(bytes.substring(0, pos)), Long.valueOf(bytes.substring(pos + 1)) };
		}
	}

	private void doNormalRequest(File file, HttpServletRequest req, HttpServletResponse resp, Object sagefile) throws IOException {
		doRangeRequestWithStatus(file, req, resp, sagefile, getRanges(req.getHeader("Range"), file.length()));
	}
}
