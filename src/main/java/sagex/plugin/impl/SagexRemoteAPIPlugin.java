package sagex.plugin.impl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import sage.SageTVPlugin;
import sage.SageTVPluginRegistry;
import sagex.plugin.AbstractPlugin;
import sagex.plugin.ConfigValueChangeHandler;
import sagex.remote.jetty.JettyInitializer;
import sagex.remote.rmi.SageRMIServer;

public class SagexRemoteAPIPlugin extends AbstractPlugin {
    public static SagexRemoteAPIPlugin pluginInstance = null;

    public static SagexRemoteAPIPlugin getPluginInstance() {
        return pluginInstance;
    }

    public SagexRemoteAPIPlugin(SageTVPluginRegistry registry) {
        super(registry);
        
        addProperty(SageTVPlugin.CONFIG_BOOL, SagexConfiguration.PROP_ENABLE_RMI, "true", "Enable RMI Remote API", "Allows you to access the SageTV server remotely using the sagex remote apis over Java/RMI");
        addProperty(SageTVPlugin.CONFIG_INTEGER, SagexConfiguration.PROP_RMI_PORT, "1098", "RMI Port", "Only change this if you absolutely require the RMI server to use another port.  If you do change this, then remote clients will need to be updated as well to use the correct port.")
                .setVisibleOnSetting(this,SagexConfiguration.PROP_ENABLE_RMI);
        addProperty(SageTVPlugin.CONFIG_BOOL, SagexConfiguration.PROP_ENABLE_DISCOVERY, "true", "Enable RMI Discovery", "Enables remote clients to automatically discover SageTV Servers)").setVisibleOnSetting(this, SagexConfiguration.PROP_ENABLE_RMI);
        addProperty(SageTVPlugin.CONFIG_BOOL, SagexConfiguration.PROP_ENABLE_HTTP, "true", "Enable HTTP Restful API", "Enables the HTTP Rest API for SageTV (Note this requires the Jetty Plugin)");
        addProperty(SageTVPlugin.CONFIG_BOOL, SagexConfiguration.PROP_ENABLE_CORS, "true", "Enable CORS", "Allow remote web sites to call SageTV APIs");
        addProperty(SageTVPlugin.CONFIG_BOOL, SagexConfiguration.PROP_SECURE_HTTP, "true", "Secure HTTP API", "Enforces username/password authentication for /sagex/api handler").setVisibleOnSetting(this, SagexConfiguration.PROP_ENABLE_HTTP);

        String defPort = "8080";
        File jfile = new File("JettyStarter.properties");
        if (jfile.exists()) {
            Properties jprops = new Properties();
            try {
                jprops.load(new FileInputStream(jfile));
                if (jprops.containsKey("jetty.port")) {
                    defPort = jprops.getProperty("jetty.port");
                }
            } catch (Throwable e) {
                log.warn("Wasn't able to load the jetty properties to discover port");
            }
        }

        addProperty(SageTVPlugin.CONFIG_INTEGER, SagexConfiguration.PROP_HTTP_PORT, defPort, "HTTP Port", "This value should be the same as youre Jetty HTTP Port (usually autodetected)").setVisibleOnSetting(this, SagexConfiguration.PROP_ENABLE_HTTP);
        
        // test for multi choice
//        addProperty(SageTVPlugin.CONFIG_CHOICE, "sagex/test/testChoice1", "1", "Test Choice 1", "Tests Multiple Choice 1", new String[] {"1","2","3","4","5"});
//        addProperty(SageTVPlugin.CONFIG_CHOICE, "sagex/test/testChoice2", "1", "Test Choice 2", "Tests Multiple Choice 2", new String[] {"1","2","3","4","5"}, ",");
//        addProperty(SageTVPlugin.CONFIG_MULTICHOICE, "sagex/test/testChoice3", "", "Test Choice 3", "Tests Multiple Choice 3", new String[] {"1","2","3","4","5"});
//        addProperty(SageTVPlugin.CONFIG_MULTICHOICE, "sagex/test/testChoice4", "", "Test Choice 4", "Tests Multiple Choice 4", new String[] {"1","2","3","4","5"}, ",");
    }

    @ConfigValueChangeHandler(SagexConfiguration.PROP_SECURE_HTTP)
    public void onSecureHTTPChanged(String setting) {
        log.info("HTTP Secure Enabled Flag Changed: " + getConfigBoolValue(setting));
        JettyInitializer.updateAuthentication();
    }

    
    @ConfigValueChangeHandler(SagexConfiguration.PROP_ENABLE_RMI)
    public void onRMIEnabledChanged(String setting) {
        log.info("RMI Enabled Flag Changed: " + getConfigBoolValue(setting));
        if (getConfigBoolValue(setting)) {
            if (!SageRMIServer.getInstance().isRunning()) {
                SageRMIServer.getInstance().startServer();
            }
        } else {
            if (SageRMIServer.getInstance().isRunning()) {
                SageRMIServer.getInstance().stopServer();
            }
        }
    }

    @ConfigValueChangeHandler(SagexConfiguration.PROP_RMI_PORT)
    public void onRMIPortEnabledChanged(String setting) {
        int rmiPort = getConfigIntValue(setting);
        log.info("RMI Port Changed: " + rmiPort);
        if (SageRMIServer.getInstance().isRunning()) {
            SageRMIServer.getInstance().stopServer();
            SageRMIServer.getInstance().startServer();
        }
    }
    
    @ConfigValueChangeHandler(SagexConfiguration.PROP_ENABLE_HTTP)
    public void onHTTPEnabledChanged(String setting) {
        log.info("HTTP Enabled Flag Changed: " + getConfigBoolValue(setting));
        JettyInitializer.updateAuthentication();
    }

    /*
     * (non-Javadoc)
     * 
     * @see sagex.plugin.AbstractPlugin#start()
     */
    @Override
    public void start() {
    	try{
	        super.start();
	        
	        log.info("Starting sagex-api-services Plugin");
	        if (getConfigBoolValue(SagexConfiguration.PROP_ENABLE_RMI)) {
	            SageRMIServer.getInstance().startServer();
	        }
    	} catch (Throwable t) {
    		log.warn("Sagex Plugin failed to start correctly", t);
    	}
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see sagex.plugin.AbstractPlugin#stop()
     */
    @Override
    public void stop() {
        super.stop();
        log.info("Stopping sagex-api-services Plugin");
        if (getConfigBoolValue(SagexConfiguration.PROP_ENABLE_RMI)) {
            SageRMIServer.getInstance().stopServer();
        }
    }
}
