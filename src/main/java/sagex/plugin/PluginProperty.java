package sagex.plugin;

import sage.SageTVPlugin;

/**
 * A PluginProperty is a sage tv configuration item.  It contains information about the property, it's default value,
 * visibility, persistence, label, help, etc.  This class is used by the {@link AbstractPlugin} to pass that information
 * to sagetv so that sagetv can create the Plugin configuration.  Typically a {@link PluginProperty} is created by calling
 * the addProperty() method on the {@link AbstractPlugin}
 * 
 * @author seans
 *
 */
public class PluginProperty {
    private String[] options;
    private String defaultValue;
    private int type;
    private String help;
    private String label;
    private String setting;
    private String valueSep;
    private String visibleOnSetting;

    private IPropertyPersistence persistence = null;
    private IPropertyVisibility visibility = null;
    private IPropertyValidator validator = null;
    
    /**
     * Convenience constructor
     * @param type
     * @param setting
     * @param defaultValue
     * @param label
     * @param help
     */
    public PluginProperty(int type, String setting, String defaultValue, String label, String help) {
        this(type, setting, defaultValue, label, help, null, null);
    }

    /**
     * Convenience constructor
     * @param type
     * @param setting
     * @param defaultValue
     * @param label
     * @param help
     * @param options
     */
    public PluginProperty(int type, String setting, String defaultValue, String label, String help, String[] options) {
        this(type, setting, defaultValue, label, help, options, ";");
    }
    
    /**
     * Creates a plugin plugin with the given data.
     * 
     * @param type data type as defined in {@link SageTVPlugin}
     * @param setting setting/property id
     * @param defaultValue default value
     * @param label label
     * @param help user help text
     * @param options in the case of a list of values property, this is the complete list of possible values
     * @param optionSep the value separator used for serializing and deserializing the value list
     */
    public PluginProperty(int type, String setting, String defaultValue, String label, String help, String[] options, String optionSep) {
        super();
        this.type = type;
        this.setting = setting;
        this.defaultValue = defaultValue;
        this.label = label;
        this.help = help;
        this.options = options;
        this.valueSep = optionSep;
        if (type==SageTVPlugin.CONFIG_BUTTON) {
            this.persistence = new NoPropertyPersistence();
        } else {
            this.persistence = new ClientPropertyPersistence();
        }
    }

    /**
     * get the setting/property
     * @return
     */
    public String getSetting() {
        return setting;
    }
    
    /**
     * get the label
     * @return
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * set the label
     * @return
     */
    public void setLabel(String label) {
        this.label = label ;
    }
    
    /**
     * get the user help
     * @return
     */
    public String getHelp() {
        return help;
    }
    
    /**
     * set the user help
     * @return
     */
    public void setHelp(String help) {
        this.help = help;
    }

    /**
     * get the data type as defined by {@link SageTVPlugin}
     * @return
     */
    public int getType() {
        return type;
    }
    
    /**
     * get the default value
     * @return
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * get the possible options for this property or null, if there are none. (only valid if the type is set to CONFIG_CHOICE)
     * @return
     */
    public String[] getOptions() {
        return options;
    }

    /**
     * set the possible options for this property or null, if there are none. (only valid if the type is set to CONFIG_CHOICE)
     * @return
     */
    public void setOptions(String[] options) {
        this.options = options;
    }

    /**
     * return the value list separator (default is semi-colon)
     * @return the valueSep
     */
    public String getValueSep() {
        return valueSep;
    }

    /**
     * set the value list separator
     * @param valueSep the valueSep to set
     */
    public void setValueSep(String valueSep) {
        this.valueSep = valueSep;
    }
    
    /**
     * set the value of this property.  It will pass the value to the {@link IPropertyPersistence} implementation.
     * 
     * @param value
     */
    public void setValue(String value) {
        persistence.set(setting, value);
    }
    
    /**
     * get the current value of this property from the {@link IPropertyPersistence} implemenation
     * @return
     */
    public String getValue() {
        return persistence.get(setting, defaultValue);
    }
    
    /**
     * Set the property persistence for this property. If none is set, then {@link ClientPropertyPersistence} is used.
     * @param persistence
     * @return
     */
    public PluginProperty setPersistence(IPropertyPersistence persistence) {
        this.persistence=persistence;
        return this;
    }

    /**
     * Set the {@link IPropertyVisibility} for this property.
     * 
     * @param vis
     * @return
     */
    public PluginProperty setVisibility(IPropertyVisibility vis) {
        this.visibility = vis;
        return this;
    }

    /**
     * Convenience method to set the {@link PropertyVisibleOnSetting} for the given setting
     * 
     * @param plugin
     * @param visibleOnSetting
     * @return
     */
    public PluginProperty setVisibleOnSetting(AbstractPlugin plugin, String visibleOnSetting) {
        return setVisibility(new PropertyVisibleOnSetting(plugin, visibleOnSetting));
    }
    
    /**
     * if a {@link IPropertyVisibility} implementation is set, then it will be querries and that value will
     * be returned, other true is returned.
     * @return
     */
    public boolean isVisible() {
        if (visibility!=null) return visibility.isVisible();
        return true;
    }

    /**
     * @deprecated use setValueSep
     * @param optionSep
     */
    @Deprecated()
    public void setOptionSep(String optionSep) {
        this.valueSep = optionSep;
    }

    /**
     * @deprecated use getValueSep
     * @return
     */
    @Deprecated()
    public String getOptionSep() {
        return valueSep;
    }
    
    /**
     * @deprecated use isVisible
     * @return
     */
    @Deprecated
    public String getVisibleOnSetting() {
        return visibleOnSetting;
    }

    /**
     * @deprecated use setVisibleOnSetting(plugin, setting)
     * @param visibleOnSetting
     */
    @Deprecated
    public void setVisibleOnSetting(String visibleOnSetting) {
        this.visibleOnSetting = visibleOnSetting;
    }

    /**
     * get the validator associated with this property
     * 
     * @return
     */
	public IPropertyValidator getValidator() {
		return validator;
	}

	/**
	 * Sets the validator for this plugin property
	 * 
	 * @param validator
	 * @return
	 */
	public PluginProperty setValidator(IPropertyValidator validator) {
		this.validator = validator;
		return this;
	}
}
