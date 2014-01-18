package sagex.remote.api;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;

/**
 * Returns the contents as a raw stream to the output.  User can pass encoder=raw&raw_content_type=MIME_TYPE and have
 * the contents returned as a raw data.  This is useful when you want to return data, such as a custom xml, m3u data, etc.
 * 
 * @author sls
 */
public class RawReplyEncoder implements ReplyEncoder {
	public RawReplyEncoder() {
	}

	@Override
	public String getContentType(HttpServletRequest req) {
		return req.getParameter("raw_content_type");
	}

	@Override
	public String encodeError(Exception e) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		e.printStackTrace(ps);
		ps.flush();
		return baos.toString();
	}

	@Override
	public String encodeReply(Object o, HttpServletRequest req) throws Exception {
		if (o==null) return null;
		return o.toString();
	}
}
