package sagex.remote.api;

import javax.servlet.http.HttpServletRequest;

import sagex.util.ImageUtil;


/**
 * Dummy PlaceHolder Encoder for images
 * @author sean
 */
public class ImageReplyEncoder implements ReplyEncoder {

	public ImageReplyEncoder() {
	}

	@Override
	public String getContentType(HttpServletRequest req) {
		return ImageUtil.DEFAULT_IMAGE_MIME_TYPE;
	}

	@Override
	public String encodeError(Exception e) {
		return "Failed to encode Image: " + e.getMessage();
	}

	@Override
	public String encodeReply(Object o, HttpServletRequest req)	throws Exception {
		return null;
	}
}
