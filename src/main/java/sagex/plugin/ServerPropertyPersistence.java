package sagex.plugin;

import sagex.api.Configuration;

/**
 * {@link IPropertyPersistence} that stores properties to the SageTV server.
 * 
 * @author seans
 *
 */
public class ServerPropertyPersistence implements IPropertyPersistence {
    public ServerPropertyPersistence() {
    }
    
    public String get(String property, String defValue) {
        return Configuration.GetServerProperty(property, defValue);
    }

    public void set(String property, String value) {
        Configuration.SetServerProperty(property, value);
    }
}
