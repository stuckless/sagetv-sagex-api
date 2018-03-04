package sagex.remote.media;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Constructor;

public class ProxySageMediaRequestHandler implements SageMediaRequestHandler {
    private String proxyClass = null;
    private String arg = null;
    private SageMediaRequestHandler handler = null;
    
    public ProxySageMediaRequestHandler(String cls, String arg) {
        this.proxyClass=cls;
        this.arg=arg;
    }
    
    public void processRequest(HttpServletRequest req, HttpServletResponse resp, Object sageMediaFile) throws Exception {
        if (handler == null) {
            Class<SageMediaRequestHandler> cls = (Class<SageMediaRequestHandler>) Class.forName(proxyClass);
            if (arg!=null) {
                Constructor<SageMediaRequestHandler> c = cls.getConstructor(String.class);
                handler = c.newInstance(arg);
            } else {
                handler = cls.newInstance();
            }
        }
        handler.processRequest(req, resp, sageMediaFile);
    }
}
