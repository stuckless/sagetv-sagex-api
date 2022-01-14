package sagex.remote;

import sagex.plugin.impl.SagexConfiguration;
import sagex.remote.api.ApiHandler;
import sagex.remote.media.MediaHandler;
import sagex.remote.rmi.SageRMIServer;
import sagex.remote.services.SSJSServiceHandler;
import sagex.util.ILog;
import sagex.util.LogProvider;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class SagexServlet extends HttpServlet {
    public static final String DEBUG_ATTRIBUTE = "SagexServlet.debug";

    private static final long serialVersionUID = 1L;

    public interface SageHandler {
        void handleRequest(String args[], HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
    }

    private static ILog log = LogProvider.getLogger(SagexServlet.class);
    private static boolean initialized = false;
    private static Map<String, SageHandler> sageHandlers = new HashMap<String, SageHandler>();
    private static Map<String, Object> staticData = new HashMap<String, Object>();
    static SagexConfiguration config = new SagexConfiguration();

    public SagexServlet() {
        log.info("Sage Remote API Servlet for Jetty is loaded.");
    }


    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        enableCORS("*","*","*", request, response);

        String accessControlRequestHeaders = request.getHeader("Access-Control-Request-Headers");
        if (accessControlRequestHeaders != null) {
            response.addHeader("Access-Control-Allow-Headers", accessControlRequestHeaders);
        }

        String accessControlRequestMethod = request.getHeader("Access-Control-Request-Method");
        if (accessControlRequestMethod != null) {
            response.addHeader("Access-Control-Allow-Methods", accessControlRequestMethod);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.debug("Handling remote request: " + req.getPathInfo() + (req.getQueryString() != null ? ("?" + req.getQueryString()) : ""));
        if ("true".equals(req.getParameter("_debug")) || req.getPathInfo().contains(".debug.")) {
            req.setAttribute(DEBUG_ATTRIBUTE, true);
        }

        //if (config.getBoolean(SagexConfiguration.PROP_ENABLE_CORS, true))
        enableCORS("*", "*", "*", req, resp);

        resp.addHeader("X-SagexCors", String.valueOf(config.getBoolean(SagexConfiguration.PROP_ENABLE_CORS, true)));

        try {
            try {
                if (req.getAttribute(DEBUG_ATTRIBUTE) != null) {
                    log.debug("BEGIN DEBUG: " + req.getPathInfo() + "?" + req.getQueryString());
                    for (Enumeration<String> e = req.getHeaderNames(); e.hasMoreElements(); ) {
                        String n = e.nextElement();
                        log.debug(String.format("REQ HEADER: %s=%s\n", n, req.getHeader(n)));
                    }
                    log.debug("END DEBUG");
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }

            // /command/arg1/arg2/.../
            // 0 -
            // 1 - command
            // 2 - arg1
            String args[] = req.getPathInfo().split("/");
            if (args == null || args.length < 2) {
                //if no specific sub handler is specified default to api
                SageHandler shapi = sageHandlers.get(ApiHandler.SAGE_RPC_PATH);
                String argsAPI[] = {"sagex", "api"};
                shapi.handleRequest(argsAPI, req, resp);
                //resp.sendError(404, "No Sage Handler Specified.");
                return;
            }

            String iconRequest = "favicon.ico";
            if (args[1].equals(iconRequest)){
                log.info("SagexServlet: favicon request found.  Sending to '" + req.getPathInfo() + "'");
                resp.sendRedirect(req.getPathInfo());
                return;
            }

            SageHandler sh = sageHandlers.get(args[1]);
            if (sh == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Handler: " + args[1] + ".  Valid handlers are ");
                for (String s : sageHandlers.keySet()) {
                    sb.append(s).append(", ");
                }
                sb.append(".");
                sb.append("The parameter '&_debug=true' will enable extra debug information in the logs");
                resp.sendError(404, sb.toString());
                return;
            }
            sh.handleRequest(args, req, resp);
        } catch (Throwable t) {
            log.warn("Failed to process Sage Handler!", t);
            if (!resp.isCommitted()) {
                resp.sendError(500, "Sage Servlet Failed: " + t.getMessage());
            }
        } finally {
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        if (!initialized) {
            initServices(config.getClass().getName());
        }
    }

    @Override
    public void destroy() {
        log = null;
        initialized = false;
        sageHandlers.clear();
        staticData.clear();
        super.destroy();
    }

    /**
     * Static area for putting arbitrary data
     *
     * @return
     */
    public static Map<String, Object> getUserData() {
        return staticData;
    }

    /**
     * Initialize the Sage Remote Service Handlers
     *
     * @param serverType - String containing 'jetty' for jetty, or null, for nielm
     */
    public static void initServices(String serverType) {
        initialized = true;

        log.info("Remote API Servlet initializing.");
        if (config.getBoolean(SagexConfiguration.PROP_ENABLE_HTTP, true)) {
            // register our known handlers
            sageHandlers.put(MediaHandler.SERVLET_PATH, new MediaHandler());

            // This API handler handles json, nielm, and xml
            sageHandlers.put(ApiHandler.SAGE_RPC_PATH, new ApiHandler());

            // server side javascript service (ssjs)
            sageHandlers.put(SSJSServiceHandler.SERVLET_PATH, new SSJSServiceHandler());

            try {
                // hack for now to register the Phoenix apis... need to do this dynamically
                sageHandlers.put("phoenix", (SageHandler) Class.forName("sagex.phoenix.remote.PhoenixAPIHander").newInstance());
            } catch (Throwable t) {
                log.warn("Failed to load the Phoenix API Handler", t);
            }

            try {
                // hack for now to register the Phoenix apis... need to do this dynamically
                sageHandlers.put("streaming", (SageHandler) Class.forName("sagex.phoenix.remote.streaming.PhoenixStreamingHandler").newInstance());
            } catch (Throwable t) {
                log.warn("Failed to load the Phoenix API Handler", t);
            }

            log.info("Registered Handlers.");

            // check if the RMI server is running... it may already be running
            if (config.getBoolean(SagexConfiguration.PROP_ENABLE_RMI, true) && !SageRMIServer.getInstance().isRunning()) {
                SageRMIServer.getInstance().startServer();
            }
        } else {
            log.info("Sagex Rest Services are disabled.");
        }
    }

    private static void enableCORS(String origin, String methods, String headers, HttpServletRequest request, HttpServletResponse response) {

        String host = request.getHeader("Origin");
        if (host==null) {
            host = request.getHeader("Host");
        }

        response.addHeader("Access-Control-Allow-Origin", host);
        response.addHeader("Access-Control-Request-Method", methods);
        response.addHeader("Access-Control-Allow-Headers", headers);
        response.addHeader("Access-Control-Allow-Credentials", "true");

    }
}
