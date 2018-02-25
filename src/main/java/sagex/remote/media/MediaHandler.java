package sagex.remote.media;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sagex.api.AiringAPI;
import sagex.api.MediaFileAPI;
import sagex.api.Utility;
import sagex.remote.SagexServlet.SageHandler;
import sagex.util.ILog;
import sagex.util.ImageUtil;
import sagex.util.LogProvider;

public class MediaHandler implements SageHandler {
	public static final String MEDIA_SEGMENT_ATTRIBUTE = "MediaHandler.mediasegment";
	public static final String MEDIA_M3U_ATTRIBUTE = "MediaHandler.m3u";
	
	private ILog log = LogProvider.getLogger(this.getClass());
    public static final String                   SERVLET_PATH = "media";
    private Map<String, SageMediaRequestHandler> handlers     = new HashMap<String, SageMediaRequestHandler>();

    public MediaHandler() {
        System.out.println("Media Servlet Handler Created.");
        handlers.put("properties", new PropertiesSageRequestHandler());
        handlers.put("thumbnail", new ThumbnailRequestHandler());
        handlers.put("logo", new LogoRequestHandler());
        handlers.put("mediafile", new MediaFileRequestHandler());
        handlers.put("albumart", new AlbumArtHandler());

        handlers.put("poster", new ProxySageMediaRequestHandler("sagex.phoenix.fanart.FanartMediaRequestHandler", "poster"));
        handlers.put("background", new ProxySageMediaRequestHandler("sagex.phoenix.fanart.FanartMediaRequestHandler", "background"));
        handlers.put("banner", new ProxySageMediaRequestHandler("sagex.phoenix.fanart.FanartMediaRequestHandler", "banner"));

        handlers.put("fanart", new ProxySageMediaRequestHandler("sagex.phoenix.fanart.FanartMediaRequestHandler2", null));
    }

    public void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// URL looks like
    	// /media/thumnail/213233
        // 0 - null
        // 1 - media
        // 2 - mediafile|thumbnail|debug
        // 3 - media id
    	// 4 - (optional media index)
        try {
            if (args.length < 3) {
                throw new ServletException("missing media artifact type (ie, thumbnail, poster, fanart, [should be something like /sagex/media/poster])");
            }

            SageMediaRequestHandler handler = handlers.get(args[2]);
            if (handler == null) {
                throw new Exception("Unknown Media Handler: " + args[2]);
            }

            // special case for logos
            if ("logo".equals(args[2])) {
            	handler.processRequest(req, resp, args[3]);
            	return;
            }
            
            // process mediafile requests if required
            Object sageMedia = null;

            String mediaFileId = req.getParameter("mediafile");
            if (mediaFileId == null && args.length>3) {
                mediaFileId = args[3];
            }

            if (mediaFileId!=null) {
            	// if we have a mediafileid, then validate it
            	sageMedia = getMediaFile(mediaFileId);
            }

            if (args.length>4) {
            	// we have a segment
            	req.setAttribute(MEDIA_SEGMENT_ATTRIBUTE, parseSegment(args[4]));
            }
            
            if (req.getPathInfo().endsWith(".m3u") || req.getPathInfo().endsWith(".m3u8")) {
            	req.setAttribute(MEDIA_M3U_ATTRIBUTE, true);
            }
            
            handler.processRequest(req, resp, sageMedia);
        } catch (FileNotFoundException e) {
        	log.warn("404 - Not Found - " + req.getRequestURI() + "; " + e.getMessage());
        	resp.sendError(HttpServletResponse.SC_NOT_FOUND, e.getMessage());
        } catch (Exception e) {
        	if (req.getParameter("help")!=null) {
                help(resp, e);
        	} else {
        		log.warn("503 - Internal Error - " + req.getRequestURI(), e);
            	resp.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage() + "; Consider passing ?help=true to get a help page");
        	}
        }
    }
    
    private Object parseSegment(String seg) {
    	if (seg==null) return null;
    	int pos = seg.indexOf('.');
    	if (pos!=-1) {
    		return seg.substring(0, pos);
    	}
		return seg;
	}

	private void help(HttpServletResponse resp, Throwable t) throws IOException {
        help(resp, t.getMessage(), t);
    }
    
    private void help(HttpServletResponse resp, String msg, Throwable t) throws IOException {
        PrintWriter w = resp.getWriter();
        w.printf("<h1>sagex.api (%s): Media Handler Error</H1>\n", sagex.api.Version.GetVersion());
        w.printf("<h2>%s</H2>", msg);
        if (t!=null) {
            w.println("<pre>");
            t.printStackTrace(w);
            w.println("</pre>");
        }
        w.println("<br/>");
        w.println("<h2>Usage</h2>");
        w.println("<pre>");
        w.println("/sagex/media/<b>COMMAND</b>/<b>MEDIA_FILE</b>");
        w.println("or");
        w.println("/sagex/media/<b>COMMAND</b>?mediafile=<b>MEDIA_FILE</b>\n");
        w.print("Where <b>COMMAND</b> is one of ");
        for (String s : handlers.keySet()) {
            w.print("<i>"+s+"</i>");
            w.print(", ");
        }
        w.println();
        w.println("And <b>MEDIA_FILE</b> is a Sage MediaFileId or File Path");
        w.println("</pre>");
        w.println("<br/>");
        w.println("<h2>Examples</h2>");
        w.println("<pre>");
        w.println("/sagex/media/thumbnail/3212321");
        w.println("/sagex/media/mediafile/3212321");
        w.println("/sagex/media/mediafile/3212321/1 (returns the second media file for 321321)");
        w.println("/sagex/media/mediafile/3212321?m3u (returns the mediafile as a m3u playlist)");
        w.println("/sagex/media/mediafile?mediafile=/sagetv/vidoes/tv/futurama.avi&force-mime=video/mpeg");
        w.println("/sagex/media/background/3212321");
        w.println("NOTE: background, banner, and poster all require Phoenix Fanart APIs build 30 (1.30) or later.");
        w.println("");
        w.println("You can also fetch logos");
        w.println("/sagex/media/logo/WTVDDT");
        w.println("");
        w.println("Full Phoenix Fanart is also supported");
        w.println("/sagex/media/fanart?title=ShowName&mediatype=tv|movie|music&artifact=poster|banner|background&artifactTitle=&season=#&overwrite=true|false&transform=json_transform&scalex=#&scaley=#&tag=web&mediafile=sageid|filename");
        w.println("You can mix and match whatever parameters you want for the fanart to get the exact fanart required");
        w.println("</pre>");
        w.flush();
    }


    public Object getMediaFile(String id) throws Exception {
        try {
            Object o=null;
            String parts[] = id.split(":");
            if (parts.length==1) {
                int mfid = Integer.parseInt(id);
                o = MediaFileAPI.GetMediaFileForID(mfid);
                if (o == null) {
                    // attempt to see if this is an airing ID that we can convert to
                    // a mediafile
                    o = AiringAPI.GetMediaFileForAiring(AiringAPI.GetAiringForID(mfid));
                }
            } else {
                if ("mediafile".equalsIgnoreCase(parts[0])) {
                    o =  MediaFileAPI.GetMediaFileForID(Integer.parseInt(parts[1]));
                } else if ("airing".equalsIgnoreCase(parts[0])) {
                    o = AiringAPI.GetAiringForID(Integer.parseInt(parts[1]));
                }
            }
            if (o == null) {
                throw new Exception("Unknown MediaFile/Airing: " + id);
            }
            return o;
        } catch (Exception e) {
        	log.warn("Unable to get Airing or MediaFile failed for: {" + id + "}", e);
            File f = new File(id);
            if (f.exists()) {
                Object o = MediaFileAPI.GetMediaFileForFilePath(f);
                if (o==null) {
                    throw new Exception("Unknown MediaFile/Airing: " + id);
                }
                return o;
            } else {
                throw new Exception("Not A MediaFile/Airing: " + id);
            }
        }
    }

    public static void copyStream(InputStream is, OutputStream os) throws IOException {
        byte buf[] = new byte[4096];
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        try {
            int s;
            while ((s = bis.read(buf)) > 0) {
                bos.write(buf, 0, s);
            }
        } finally {
            try {
                bos.flush();
            } catch (Exception x) {
            }
        }
        bis.close();
    }

    public static void writeSageImage(Object sagefile, HttpServletResponse resp) throws FileNotFoundException, Exception {
        // get the media file that we are going to be using
        // TODO: Maybe cache this for performance reasons
        writeSageImageFile(MediaFileAPI.GetThumbnail(sagefile), resp);
    }

    public static void writeSageImageFile(Object sageImage, HttpServletResponse resp) throws FileNotFoundException, Exception {
        if (sageImage==null) throw new FileNotFoundException("No Image");
        // SEAN: Should block until the image is loaded
        Utility.LoadImage(sageImage);
        
        BufferedImage img = Utility.GetImageAsBufferedImage(sageImage);
        if (img==null) throw new FileNotFoundException("Unable to get BufferedImage");
        resp.setContentType(ImageUtil.DEFAULT_IMAGE_MIME_TYPE);
        OutputStream os = resp.getOutputStream();
        ImageIO.write((RenderedImage) img, ImageUtil.DEFAULT_IMAGE_FORMAT, os);
        os.flush();
    }

    /**
     * like writeSageImageFile except that it will also check if the request has scaling requests
     *  
     * @param getAlbumArt
     * @param req
     * @param resp
     * @throws IOException 
     */
	public static void writeSageImageFile(Object sageImage, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if (sageImage==null) throw new FileNotFoundException("No Image");
        // SEAN: Should block until the image is loaded
        Object newImage = Utility.LoadImage(sageImage);
        if (newImage!=null) {
        	sageImage = newImage;
        }
        
        BufferedImage img = null;
        int scale[] = ScaleUtils.getScaleFromRequest(req);
        if (scale==null) {
        	img = Utility.GetImageAsBufferedImage(sageImage);
        } else {
        	if (scale[0]<=0 || scale[1]<=0) {
        		// use proportional scaling
        		img = Utility.GetImageAsBufferedImage(sageImage);
        		scale = adjustScaling(img, scale[0], scale[1]);
        		img = Utility.GetScaledImageAsBufferedImage(sageImage, scale[0], scale[1]);
        	} else {
        		img = Utility.GetScaledImageAsBufferedImage(sageImage, scale[0], scale[1]);
        	}
        	if (img==null) {
            	img = Utility.GetImageAsBufferedImage(sageImage);
        	}
        }
        
        if (img==null) throw new FileNotFoundException("Unable to get BufferedImage");
        resp.setContentType(ImageUtil.DEFAULT_IMAGE_MIME_TYPE);
        OutputStream os = resp.getOutputStream();
        ImageIO.write((RenderedImage) img, ImageUtil.DEFAULT_IMAGE_FORMAT, os);
        os.flush();
	}
	
	private static int[] adjustScaling(BufferedImage imageSrc, int scaleWidth, int scaleHeight) {
        int origWidth = imageSrc.getWidth();
        int origHeight = imageSrc.getHeight();
        
        
        if (scaleWidth == -1) {
            // scale to height
            float div = (float) imageSrc.getHeight() / scaleHeight;
            scaleWidth = (int) (imageSrc.getWidth() / div);
        }

        if (scaleHeight == -1) {
            // scale to width
            float div = (float) imageSrc.getWidth() / scaleWidth;
            scaleHeight = (int) (imageSrc.getHeight() / div);
        }
        
        // don't do anything if the scaling is larger than the original
        if (scaleWidth >= origWidth && scaleHeight >= origHeight) {
            return new int[] {origWidth, origHeight};
        } else {
            return new int[] {scaleWidth, scaleHeight};
        }
	}
}
