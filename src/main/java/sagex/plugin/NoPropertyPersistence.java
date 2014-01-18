package sagex.plugin;

/**
 * {@link IPropertyPersistence} that stores properties to the SageTV server.
 * 
 * @author jreichen
 *
 */
public class NoPropertyPersistence implements IPropertyPersistence {
    public NoPropertyPersistence() {
    }
    
    public String get(String property, String defValue) {
        return defValue;
    }

    public void set(String property, String value) {
    }
}
