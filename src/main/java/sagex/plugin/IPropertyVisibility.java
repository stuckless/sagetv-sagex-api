package sagex.plugin;

/**
 * A {@link PluginProperty} can access an implementation of this to control when the property should be visible.
 * Currently there is a {@link PropertyVisibleOnSetting} implementation that conditionally makes the current
 * property visible based on the boolean value of another property.  
 *
 * @author seans
 *
 */
public interface IPropertyVisibility {
    public boolean isVisible();
}
