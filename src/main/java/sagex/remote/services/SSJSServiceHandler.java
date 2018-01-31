package sagex.remote.services;

import sagex.remote.SagexServlet;
import sagex.remote.api.JsonReplyEncoder;
import sagex.remote.api.ReplyEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by seans on 17/04/16.
 */
public class SSJSServiceHandler implements SagexServlet.SageHandler {
    public static final String SERVLET_PATH = "ssjs";

    ServiceManager serviceManager = null;

    public SSJSServiceHandler() {
        serviceManager = new ServiceManager();
    }

    @Override
    public void handleRequest(String[] strings, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        System.out.println("Handling " + httpServletRequest.getPathInfo());
        File f=null;
        Object reply = null;
        f = new File(new File("."), httpServletRequest.getPathInfo());
        if (f.exists()) {
            try {
                reply = serviceManager.eval(f, httpServletRequest);
            } catch (Throwable e) {
                httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
                return;
            }
        } else {
            httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND, f.getAbsolutePath());
            return;
        }

        if (reply!=null) {
            ReplyEncoder encoder = new JsonReplyEncoder();
            try {
                String replyStr = encoder.encodeReply(reply, httpServletRequest);
                httpServletResponse.setContentType("text/json");
                httpServletResponse.setContentLength(replyStr.length());
                ServletOutputStream sos = httpServletResponse.getOutputStream();
                sos.print(replyStr);
                sos.flush();
            } catch (Throwable e) {
                e.printStackTrace();
                httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getLocalizedMessage());
            }
        }
    }
}
