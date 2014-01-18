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
import java.util.RandomAccess;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.api.AiringAPI;
import sagex.api.MediaFileAPI;
import sagex.util.ILog;
import sagex.util.LogProvider;

public class MediaFileRequestHandler implements SageMediaRequestHandler {
	ILog log = LogProvider.getLogger(this.getClass());
	
	public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object sagefile) throws Exception {
		if (req.getAttribute(MediaHandler.MEDIA_M3U_ATTRIBUTE)!=null) {
			processM3U(req, resp, sagefile);
			return;
		}
		
		
		// get the media file that we are going to be using
		File file = MediaFileAPI.GetFileForSegment(sagefile, getMediaSegment(req));

		if (!file.exists())
			throw new FileNotFoundException(file.getAbsolutePath());

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

	private void processM3U(HttpServletRequest req, HttpServletResponse resp,
			Object sagefile) throws IOException {

		File[] files=MediaFileAPI.GetSegmentFiles(sagefile);
		
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
		
		StringBuilder sb = new StringBuilder();
		sb.append("#EXTM3U\n");
		sb.append("#EXT-X-PLAYLIST-TYPE:VOD\n");
		sb.append("#EXT-X-TARGETDURATION:"+getDurationInSeconds(sagefile)+"\n");
		sb.append("#EXT-X-VERSION:3\n");
		sb.append("#EXT-X-MEDIA-SEQUENCE:0\n");
		for (int i=0;i<files.length;i++) {
			sb.append("#EXTINF:" + getDurationInSeconds(sagefile, i) + ".0,\n");
			sb.append(String.valueOf(i) + "\n");
		}
		sb.append("#EXT-X-ENDLIST\n");
		
		resp.setContentLength(sb.length());
		resp.setContentType("audio/mpegurl");
		resp.getWriter().write(sb.toString());
		resp.flushBuffer();
	}

	private long getDurationInSeconds(Object sagefile, int i) {
		return MediaFileAPI.GetDurationForSegment(sagefile, i)/1000;
	}

	private long getDurationInSeconds(Object sagefile) {
		return AiringAPI.GetAiringDuration(sagefile)/1000;
	}

	public void doRangeRequest(File file, HttpServletRequest req, HttpServletResponse resp, Object sagefile, long[] ranges)
			throws IOException {
		
		// TODO: Set Content length to be the length of the range
		// Content-Range: bytes 21010-47021/47022
		// and set the content range header
		// if we can't satisfy the range, then send back 416 code

		resp.setHeader("Accept-Ranges", "bytes");

		if (MediaFileAPI.IsMusicFile(sagefile)) {
			resp.setContentType("audio/mpeg");
		} else if (MediaFileAPI.IsPictureFile(sagefile)) {
			resp.setContentType("image/jpeg");
		} else {
			resp.setContentType("video/mpeg");
		}

		String forceMime = req.getParameter("force-mime");
		if (forceMime != null && forceMime.length() > 0) {
			resp.setContentType(forceMime);
		}
		
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		try {
			// as per spec, send 206 for ranges
			resp.setStatus(206);
			
			raf.seek(ranges[0]);
			FileInputStream fis = new FileInputStream(raf.getFD());
			long size = ranges[1] - ranges[0];
			resp.setHeader("Content-Length", String.valueOf(size));
			
			String contentRange = "bytes "+String.valueOf(ranges[0])+"-"+String.valueOf(ranges[1])+"/"+String.valueOf(file.length());
			resp.setHeader("Content-Range", contentRange);
			
			log.debug("Content Range: " + contentRange + " for " + file);
			log.debug("Content Length: " + size + " for " + file);
			
			long counted = 0;
			int bufSize = (int) Math.min(size, 64 * 1024);
			byte[] buf = new byte[bufSize];
			int curRead = 0;
			log.debug("beginning range with size: " + size + "; bufsize: " + bufSize + " for file " + file);
			OutputStream os = resp.getOutputStream();
			long logit = System.currentTimeMillis()+1000;
			while (counted < size) {
				curRead = fis.read(buf, 0, (int) Math.min(bufSize, size - counted));
				if (curRead == 0 || curRead == -1)
					break;
				counted += curRead;
				os.write(buf, 0, curRead);
				os.flush();
				if (System.currentTimeMillis()>logit) {
					log.debug("Still Streaming: " + file + "; " + String.valueOf(counted));
					logit = System.currentTimeMillis()+1000;
				}
			}
			os.flush();
			fis.close();
			log.debug("Finished normal range stream for file " + file + "; processed " + counted + " bytes");
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
			return new long[] { 0, fileLength };
		}
		if (bytes.startsWith("-")) {
			return new long[] { 0, Long.valueOf(bytes.substring(1)) };
		} else if (bytes.endsWith("-")) {
			return new long[] { Long.valueOf(bytes.substring(0, bytes.length() - 1)), fileLength };
		} else {
			int pos = bytes.indexOf("-");
			return new long[] { Long.valueOf(bytes.substring(0, pos)), Long.valueOf(bytes.substring(pos + 1)) };
		}
	}

	private void doNormalRequest(File file, HttpServletRequest req, HttpServletResponse resp, Object sagefile) throws IOException {
		resp.setHeader("Accept-Ranges", "bytes");
		resp.setHeader("Content-Length", String.valueOf(file.length()));

		log.debug("Setting Content-Length: " + file.length() + " for " + file);
		
		if (MediaFileAPI.IsMusicFile(sagefile)) {
			resp.setContentType("audio/mpeg");
		} else if (MediaFileAPI.IsPictureFile(sagefile)) {
			resp.setContentType("image/jpeg");
		} else {
			resp.setContentType("video/mpeg");
		}

		String forceMime = req.getParameter("force-mime");
		if (forceMime != null && forceMime.length() > 0) {
			resp.setContentType(forceMime);
		}

		OutputStream os = resp.getOutputStream();
		MediaHandler.copyStream(new FileInputStream(file), os);
		os.flush();
	}
}
