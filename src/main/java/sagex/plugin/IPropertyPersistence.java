package sagex.plugin;

/**
 * Property Persistence interface.  The {@link PluginProperty} class can accept different persistence implementations
 * to store properties to different locations.  Currently there is a {@link ClientPropertyPersistence} and a 
 * {@link ServerPropertyPersistence}, but you could create a DB Property Persistence, etc.
 * @author seans
 *
 */
public interface IPropertyPersistence {
    /**
     * Set a property by name with a given string value
     * @param property property name
     * @param value string serialized value
     */
    public void set(String property, String value);
    
    /**
     * get a named property or return the default value
     * @param property property name
     * @param defValue default value if the property is not set
     * @return the property value as a string
     */
    public String get(String property, String defValue);
}
