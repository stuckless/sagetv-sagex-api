package sagex.remote.api;

import javax.servlet.http.HttpServletRequest;

public interface ReplyEncoder {
    public String getContentType(HttpServletRequest req);
    public String encodeError(Exception e);
    public String encodeReply(Object o, HttpServletRequest req) throws Exception;
}
