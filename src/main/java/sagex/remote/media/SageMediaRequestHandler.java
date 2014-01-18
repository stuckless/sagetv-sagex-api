package sagex.remote.media;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SageMediaRequestHandler {
    public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object sageMediaFile) throws Exception;
}
