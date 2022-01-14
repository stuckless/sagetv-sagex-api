package sagex.plugin.impl;

import sagex.api.Configuration;
import sagex.util.TypesUtil;

/**
 * Simple class to hold the configuration constants, that is compatible with Sage 6

 * @author seans
 */
public class SagexConfiguration {
    public static final String PROP_ENABLE_RMI  = "sagex/api/enableRMI";
    public static final String PROP_ENABLE_CORS  = "sagex/api/enableCORS";
    public static final String PROP_RMI_PORT    = "sagex/api/RMIPort";
    public static final String PROP_ENABLE_DISCOVERY = "sagex/api/enableRMIDiscovery";
    public static final String PROP_ENABLE_HTTP = "sagex/api/enableHTTP";
    public static final String PROP_HTTP_PORT = "sagex/api/httpPort";
    public static final String PROP_JETTY_HTTP_PORT = "jetty/jetty.port";
    public static final String PROP_REAPER_INTERVAL = "sagex/api/reaperInterval";
    //public static final String PROP_SECURE_HTTP = "sagex/api/secureHttp";
    
    public void set(String setting, String value) {
        Configuration.SetProperty(setting, value);
    }

    public String get(String setting, String defValue) {
        return Configuration.GetProperty(setting, defValue);
    }
    
    public boolean getBoolean(String setting) {
        return TypesUtil.toBoolean(get(setting,"false"), false);
    }

    public boolean getBoolean(String setting, boolean def) {
        return TypesUtil.toBoolean(get(setting, String.valueOf(def)), def);
    }
    
    public int getInt(String setting) {
        return TypesUtil.toInt(get(setting,"0"), 0);
    }
}
