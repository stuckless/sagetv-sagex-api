package sagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import sagex.api.Global;
import sagex.api.MediaFileAPI;
import sagex.api.WidgetAPI;
import sagex.remote.EmbeddedSageAPIProvider;
import sagex.remote.api.ServiceFactory;
import sagex.remote.rmi.RMISageAPI;
import sagex.remote.server.DatagramPacketHandler;
import sagex.remote.server.DatagramServer;
import sagex.remote.server.SimpleDatagramClient;
import sagex.stub.NullSageAPIProvider;
import sagex.stub.StubSageAPI;
import sagex.util.ILog;
import sagex.util.LogProvider;
import sagex.util.WaitFor;

/**
 * Provides a wrapper for the SageTV services. This class enables the SageTV
 * instance to be a remote instance. If you don't force the provider, then it
 * will be auto-discovered. If you want to force a provider, then you can set
 * the System property <b>sagex.SageAPI.remoteUrl</b>
 * 
 * <pre>
 * Examples
 * System.setProperty("sagex.SageAPI.remoteUrl","http://remotehost:port/");
 * System.setProperty("sagex.SageAPI.remoteUrl", "rmi://remotehost:port");
 * </pre>
 * 
 * While the setting of a remoteUrl is optional, if you do set it, you have to
 * set it before calling any other sagex apis. <br/>
 * 
 * SageAPI depends on an {@link ISageAPIProvider} instance, which means that you
 * can create your own provider, or you can forcefully set a provider using the
 * setProvider() method. Once you set a provider it global and public for all
 * other SageAPI calls. <br/>
 * 
 * While you can use {@link SageAPI} directly it is recommended that you use the
 * convenience classes, such as {@link MediaFileAPI}, {@link WidgetAPI},
 * {@link Global}, etc. Normally you would not be directly calling methods of
 * this class.
 * 
 * @author seans
 * 
 */
public class SageAPI {
    /**
     * Remote server hostname or ip * {@value}
     */
    public static final String      PROP_REMOTE_SERVER        = "server";

    /**
     * Remote server rmi port * {@value}
     */
    public static final String      PROP_REMOTE_RMI_PORT      = "rmi.port";

    /**
     * Remote server http port * {@value}
     */
    public static final String      PROP_REMOTE_HTTP_PORT     = "http.port";

    /**
     * Remote server url, ie, http://host:port/ or rmi://host:port * * {@value}
     */
    public static final String      PROP_REMOTE_URL           = "sagex.SageAPI.remoteUrl";

    /**
     * default timeout when waiting for discovery
     */
    private static final int        DEFAULT_DISCOVERY_TIMEOUT = 5000;

    private static ILog             log                       = LogProvider.getLogger(SageAPI.class);
    private static ISageAPIProvider remoteProvider            = null;
    private static ISageAPIProvider provider                  = null;
    private static Properties       remoteProviderProperties  = null;
    private static ServiceFactory   scriptingServices         = null;

    // list of all the known remote providers...
    private static List<Properties> remoteProviders           = new ArrayList<Properties>();

    private static final Set<String> bubbleExceptions = new TreeSet<String>();
    
    static {
        try {
            scriptingServices = new ServiceFactory();
        } catch (Throwable t) {
            log.warn("Scripting Services Disabled", t);
        }
        
        // these APIs will allow their Exceptions to be bubbled up
        bubbleExceptions.add("EvaluateExpression");
    }

    /**
     * Should only be used in testing to re-init the SageAPI instance to empty
     */
    public static void initialize() {
        remoteProvider            = null;
        provider                  = null;
        remoteProviderProperties  = null;
        remoteProviders           = new ArrayList<Properties>();
    }

    public static ISageAPIProvider getProvider() {
        if (provider == null) {
            try {
                setProvider(new EmbeddedSageAPIProvider());
            } catch (Throwable t) {
                try {
                    // System.out.println("INFO: Attempting to set Remote API Provider...");
                    setProvider(getRemoteProvider());
                } catch (Throwable tt) {
                    log.warn("No Remote Provider, using Null API Provider (this is ok some times).");
                    setProvider(new NullSageAPIProvider());
                }
            }
        }
        return provider;
    }

    public static ISageAPIProvider getRemoteProvider() {
        if (remoteProvider == null) {
            // to find the provider to use
            try {
                // System.out.println("SageAPI Provider is not set, will try to find the server...");

                // check if the sagex.SageAPI.remoteUrl is set
                String remoteUrl = System.getProperty(PROP_REMOTE_URL);
                if (remoteUrl == null) {
                    discoverRemoteServers(DEFAULT_DISCOVERY_TIMEOUT);
                    // discover remote servers will notify use about any remote
                    // servers... so we need to wait
                    // until we have one set...
                    new WaitFor() {
                        @Override
                        public boolean isDoneWaiting() {
                            return remoteProvider != null;
                        }
                    }.waitFor(DEFAULT_DISCOVERY_TIMEOUT, 100);
                } else {
                    URI u = new URI(remoteUrl);
                    if ("rmi".equals(u.getScheme())) {
                        remoteProvider = (new RMISageAPI(u.getHost(), u.getPort()));
                    } else if ("null".equals(u.getScheme())) {
                        remoteProvider = new NullSageAPIProvider();
                    } else if ("stub".equals(u.getScheme())) {
                        remoteProvider = new StubSageAPI();
                    } else {
                    throw new Exception("Unknown and unhandled remote request type for " + u);
                    }
                }
            } catch (Throwable t) {
                throw new RuntimeException(t);
            }
        }
        return remoteProvider;
    }

    public static void setProvider(ISageAPIProvider provider) {
        log.info("Sage Provider Implementation: " + provider.getClass().getName() + "; " + provider.toString());
        SageAPI.provider = provider;
    }

    public static Object call(String serviceName, Object[] args) {
        try {
            return SageAPI.getProvider().callService(serviceName, args);
        } catch (Throwable e) {
    		processCallError(serviceName, args, e);
        }
        return null;
    }
    
    private static void processCallError(String serviceName, Object[] args, Throwable t) {
    	if (bubbleExceptions.contains(serviceName)) {
    		throw new RuntimeException("Sage API Failed for " + serviceName + "; Args: " + args, t);
    	} else {
    		if (t instanceof InvocationTargetException) {
	        	if (((InvocationTargetException) t).getTargetException()!=null) {
	        		logError(serviceName, args, ((InvocationTargetException) t).getTargetException());
	        	}
    		} else {
        		logError(serviceName, args, t);
        		if (isRemote()) {
        			// As per Slugger's Request, REMOTE api failures will
        			// bubble up
        			throw new RuntimeException("Remote API Failed", t);
        		}
    		}
    	}
    }

    private static void logError(String serviceName, Object[] args, Throwable t) {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Call failed for Service: ").append(serviceName);
    	if (args!=null && args.length>0) {
    		sb.append("; Args: ");
    		for (int i=0;i<args.length;i++) {
    			if (i>0) sb.append(", ");
    			sb.append(String.valueOf(i)).append(": ").append(args[i]);
    		}
    	}
    	log.warn(sb.toString(), t);
	}

	public static Object call(String context, String serviceName, Object[] args) {
        try {
            return SageAPI.getProvider().callService(context, serviceName, args);
        } catch (Throwable e) {
    		processCallError(serviceName, args, e);
        }
        return null;
    }

    public static Object call(UIContext context, String serviceName, Object[] args) {
        if (context == null) {
            UIContext ctx = getUIContext();
            if (ctx != null) {
                return call(ctx, serviceName, args);
            } else {
                return call(serviceName, args);
            }
        } else {
            return call(context.getName(), serviceName, args);
        }
    }

    /**
     * Sets the current UI context that is accessible for this thread and its
     * children. This does not FORCE a UI to be passed, but only ensures the
     * when getUIContext() is called withing the running thread, then it will
     * return this value. You still need to pass the UI context explicitly to
     * any method that requires a UI context.
     * 
     * @param context
     *            - String or UIContext object
     */
    public static void setUIContext(Object context) {
        if (context instanceof String) {
            UIContext.setCurrentContext(new UIContext((String) context));
        } else if (context instanceof UIContext) {
            UIContext.setCurrentContext((UIContext) context);
        } else {
            UIContext.setCurrentContext(null);
        }
    }

    /**
     * returns the currently set UI context for this thread.
     * 
     * @return ui context for this thread. (can be null)
     */
    public static UIContext getUIContext() {
        return UIContext.getCurrentContext();
    }

    /**
     * returns true if the provider instance is a remote API instance.
     * 
     * @return
     */
    public static boolean isRemote() {
        return (getProvider() == null || !(getProvider() instanceof EmbeddedSageAPIProvider));
    }

    /**
     * Returns the provider properties. Can be null.
     * 
     * @return
     */
    public static Properties getProviderProperties() {
        return remoteProviderProperties;
    }

    /**
     * Sets the properties for a properties. This is normally set automatically
     * when a provider is created and set.
     * 
     * @param props
     */
    public static void setProviderProperties(Properties props) {
        remoteProviderProperties = props;
    }

    /**
     * Calls a scripting service. Scripts are places in
     * SAGETV_HOME/sages/services/. These are simple javascript files.
     * 
     * @param context
     *            UI context
     * @param packageName
     *            usually the script filename (not the full directory path)
     * @param serviceName
     *            usually the function to call within the script
     * @param args
     *            string array of args
     * @return object reply, or throws a RuntimeException if the script
     *         generates and error, or if the scripting services are disabled
     */
    public Object callScript(UIContext context, String packageName, String serviceName, String[] args) {
        if (scriptingServices != null) {
            try {
                return scriptingServices.callService((context == null) ? null : context.getName(), packageName, serviceName, args);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("Javascript Service Factory is disabled.");
    }

    /**
     * Same as other callScript() except without a UI context. Scripts can
     * always call SageAPI.GetUIContext() to get the current UI context as
     * needed.
     * 
     * @param packageName
     * @param serviceName
     * @param args
     * @return
     */
    public Object callScript(String packageName, String serviceName, String[] args) {
        return callScript(null, packageName, serviceName, args);
    }

    /**
     * Returns a List of the discovered Remote API Providers. Each provider in
     * the list will have a set of properties. The known properties are server,
     * rmi.port, and http.port.
     */
    public static List<Properties> getKnownRemoteAPIProviders() {
        return remoteProviders;
    }

    /**
     * Adds a remote provider's properties to the list of known remote api
     * providers. If there isn't a provider implementation created yet, for this
     * SageAPI instance, then a remote API provider will be created and used.
     * 
     * @param props
     */
    public static void addRemoteProvider(Properties props) {
        if (props == null) return;

        String server = props.getProperty(PROP_REMOTE_SERVER);
        if (server == null) return;

        boolean found = false;
        for (Properties p : remoteProviders) {
            if (server.equals(p.getProperty(PROP_REMOTE_SERVER))) {
                found = true;
                break;
            }
        }

        if (!found) {
            remoteProviders.add(props);
        }

        if (remoteProvider == null) {
            // next, if we don't have a provider set yet, then let's set the
            // remote API provider
            remoteProvider = (new RMISageAPI(props.getProperty(PROP_REMOTE_SERVER), Integer.parseInt(props.getProperty(PROP_REMOTE_RMI_PORT))));
            remoteProviderProperties = props;
        }
    }

    /**
     * Discover Remote Servers and add them to the SageAPI remote servers list
     * 
     * @param timeout
     *            only do the discovery until the timeout has been met
     */
    public static void discoverRemoteServers(final long timeout) {
        SimpleDatagramClient client = new SimpleDatagramClient();
        try {
            client.send("Discover SageTV Remote API Server", DatagramServer.MULTICAST_GROUP, DatagramServer.MULTICAST_PORT, new DatagramPacketHandler() {
                public void onDatagramPacketReceived(DatagramPacket packet) {
                    ByteArrayInputStream bais = new ByteArrayInputStream(packet.getData());
                    try {
                        Properties props = new Properties();
                        props.load(bais);
                        try {
                        	props.put("server.ip", packet.getAddress().getHostAddress());
                        } catch (Exception e) {
                        	
                        }
                        System.out.println("Adding Remote Server: " + props.getProperty("server.ip"));
                        SageAPI.addRemoteProvider(props);
                    } catch (IOException e) {
                        onFailure(e);
                    }
                }

                public void onFailure(Throwable t) {
                    log.warn("Discovery Error", t);
                }
            }, timeout);
        } catch (Exception e) {
            log.warn("discoverRemoteServers failed!", e);
        }
    }

}
