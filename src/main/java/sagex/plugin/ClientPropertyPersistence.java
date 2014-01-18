package sagex.plugin;

import sagex.api.Configuration;


/**
 * Simple persistence that stores the given properties to the SageTV Client configuration.  Ie, this implementation
 * uses {@link Configuration}.GetProperty and {@link Configuration}.SetProperty
 * 
 * @author seans
 *
 */
public class ClientPropertyPersistence implements IPropertyPersistence {
    public ClientPropertyPersistence() {
    }
    
    public String get(String property, String defValue) {
        return Configuration.GetProperty(property, defValue);
    }

    public void set(String property, String value) {
        Configuration.SetProperty(property, value);
    }
}
