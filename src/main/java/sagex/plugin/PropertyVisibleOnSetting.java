package sagex.plugin;

/**
 * {@link IPropertyVisibility} implemenation that will return true if the specified property is true. ie, this
 * is used to conditionally show other properties based on the boolean value of another property. 
 * 
 * @author seans
 *
 */
public class PropertyVisibleOnSetting implements IPropertyVisibility {
    private AbstractPlugin plugin;
    private String property;

    public PropertyVisibleOnSetting(AbstractPlugin plugin, String property) {
        this.plugin=plugin;
        this.property=property;
    }
    
    public boolean isVisible() {
        return plugin.getConfigBoolValue(property);
    }
}
