package sagex.plugin;

import sage.SageTVPlugin;
import sage.SageTVPluginRegistry;
import sagex.util.ILog;
import sagex.util.LogProvider;
import sagex.util.TypesUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * AbstractPlugin intends to make it even easier for a plugin developer to
 * create Plugin Activator classes for SageTV
 * 
 * Typically a developer will subclass this Plugin class and call addProperty()
 * for each managed property in their plugin's constructor. That will enable
 * SageTV to be able to configure their plugin.
 * 
 * Developers can subscribe to events using the {@link SageEvent} annotation on
 * a method. You can name you methods whatever you want, but they must accept
 * either no arguments, or the standard sage event args, which is a string and a
 * map.
 * 
 * Your events are automatically registered when you plugin starts and
 * unregistered when your plugin stops. For this reason, if you override the
 * start() and stop() methods, you should call super.start() and supert.stop()
 * accordingly.
 * 
 * If use the {@link ConfigValueChangeHandler} annotation on a method then that method will be called
 * when the value changes.  The method can either accept no parameters, or it can accept
 * a single String argument, which will be the setting id.
 * 
 * If you use the {@link ButtonClickHandler} annotation on a method, then that method will be called
 * as a button click event for the given setting, provided the setting is configured as CONFIG_BUTTON as
 * per the {@link SageTVPlugin} constant.  ButtonClickHandlers are used if you need to be notified when the
 * user clicks your button.
 * 
 * If your plugin needs to handle sagetv events, you can define a method and then use the
 * {@link SageEvent} annotation to indicate that method should be called on that event name. If
 * your task is a long running tasking, ie, it could take several seconds to complete, then it
 * is recommended that you use the background=true attribute on the annotation to have your
 * event handled in a background thread.
 * 
 * You can control "where" a plugin property's value should be stored by setting a {@link IPropertyPersistence} 
 * implementation on the {@link PluginProperty}.  The default implementation uses {@link ClientPropertyPersistence} but
 * there is also a {@link ServerPropertyPersistence} as well.
 * 
 * If a property has some special case for determining when it should be shown, then you can set a custom {@link IPropertyVisibility}
 * implementation for the class.  Currently you can control a property's visibily using another property, but you
 * write your own implementation for your needs.
 * 
 * If a property requires some special validation BEFORE it can set, then you can add a {@link IPropertyValidator}
 * implementation to your property.  By default, properties do not have validators, and there are no prebuilt validators.
 * 
 * @author seans
 */
public class AbstractPlugin implements SageTVPlugin {
    protected ILog                        log   = LogProvider.getLogger(this.getClass());
    protected Map<String, PluginProperty> props = new LinkedHashMap<String, PluginProperty>();
    protected Timer backgroundTaskTimer = null;
    protected SageTVPluginRegistry        pluginRegistry;

    public AbstractPlugin(SageTVPluginRegistry registry) {
        this.pluginRegistry = registry;
    }

    protected void registerEvents() {
        for (Method m : this.getClass().getMethods()) {
            SageEvent evt = m.getAnnotation(SageEvent.class);
            if (evt != null) {
                if (pluginRegistry != null) {
                    pluginRegistry.eventSubscribe(this, evt.value());
                } else {
                    log.warn("SageTV Plugin Registry is null; Can't register event: " + evt.value());
                }
            }
        }
    }

    protected void unregisterEvents() {
        if (pluginRegistry != null) {
            for (Method m : this.getClass().getMethods()) {
                SageEvent evt = m.getAnnotation(SageEvent.class);
                if (evt != null) {
                    pluginRegistry.eventUnsubscribe(this, evt.value());
                }
            }
        }
    }

    /**
     * Add a new PluginProperty to be managed by this plugin.
     * 
     * @param prop {@link PluginProperty} instance
     * @return {@link PluginProperty}
     */
    protected PluginProperty addProperty(PluginProperty prop) {
        return props.put(prop.getSetting(), prop);
    }

    /**
     * Convenience method for adding a property
     * 
     * @param type
     * @param setting
     * @param defaultValue
     * @param label
     * @param help
     * @return
     */
    public PluginProperty addProperty(int type, String setting, String defaultValue, String label, String help) {
        return addProperty(type, setting, defaultValue, label, help, null, null);
    }

    /**
     * Convenience method for adding a property
     * @param type
     * @param setting
     * @param defaultValue
     * @param label
     * @param help
     * @param options
     * @return
     */
    public PluginProperty addProperty(int type, String setting, String defaultValue, String label, String help, String[] options) {
        return addProperty(type, setting, defaultValue, label, help, options, ";");
    }

    /**
     * Convenience method for adding a property.  Once a property is added, you can get a reference to the newly added {@link PluginProperty}
     * that be used to further configure the property.
     * 
     * The defaule {@link IPropertyPersistence} for newly added properties is {@link ClientPropertyPersistence} but you can
     * change that after the fact by calling setPeristence on the property to set another persistence such as {@link ServerPropertyPersistence}
     * 
     * @param type a Data Type from {@link SageTVPlugin}
     * @param setting the setting/property id. Usually represents a configuration property in Sage.properties
     * @param defaultValue the default value for your property
     * @param label the label for your property
     * @param help user help for your property
     * @param options if you property is a list of values, then this is an array of possible values for your property
     * @param optionSep this is the separator for your values, default is semi-colon
     * @return newly created property that has been added to the plugin
     */
    public PluginProperty addProperty(int type, String setting, String defaultValue, String label, String help, String[] options, String optionSep) {
        PluginProperty p = new PluginProperty(type, setting, defaultValue, label, help, options, optionSep);
        addProperty(p);
        return p;
    }

    public void destroy() {
    }

    protected PluginProperty getPluginPropertyForSetting(String setting) {
        PluginProperty f = props.get(setting);
        if (f != null) {
            return f;
        }
        log.warn("Missing PluginProperty: " + setting);
        return null;
    }

    /**
     * Called when the plugin starts.  If you override, then call super.start();
     */
    public void start() {
        registerEvents();
    }

    /**
     * Called when the plugin stops. If you override, then call super.stop();
     */
    public void stop() {
        unregisterEvents();
    }

    /**
     * To handle events, create methods in your class that accept these
     * parameters but are annotated using the {@link SageEvent} annotation.
     * 
     * A sage event method can be defined to accept no args, both args, or just
     * the Map arg.
     */
    public void sageEvent(String eventName, Map eventVars) {
        boolean fired = false;
        for (Method m : this.getClass().getMethods()) {
            SageEvent e = m.getAnnotation(SageEvent.class);
            try {
                if (e != null && e.value().equals(eventName)) {
                    Class cls[] = m.getParameterTypes();
                    m.setAccessible(true);
                    if (cls.length == 0) {
                        //m.invoke(this, (Object[]) null);
                    	invoke(e.background(), m, this, (Object[])null);
                    } else {
                        if (cls.length == 2) {
                            //m.invoke(this, new Object[] { eventName, eventVars });
                        	invoke(e.background(), m, this, eventName, eventVars);
                        } else {
                            if (cls[0] == String.class) {
                                // m.invoke(this, new Object[] { eventName });
                            	invoke(e.background(), m, this, eventName);
                            } else {
                                //m.invoke(this, new Object[] { eventVars });
                            	invoke(e.background(), m, this, eventVars);
                            }
                        }
                    }
                    fired = true;
                }
            } catch (Exception ex) {
                log.warn("Failed to dispatch event for: " + eventName + " to method " + m.getName() + " in class " + this.getClass().getName(), ex);
            }
        }

        if (!fired) {
            log.warn("Failed to handled SageEvent: '" + eventName + "' in class: " + this.getClass().getName());
        }
    }
    
    /**
     * Will invoke the method in a background thread.
     * 
     * @param background if true, then the method will be invoked in a background thread
     * @param m method
     * @param o object
     * @param args args
     * @return null if run in the background
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private Object invoke(boolean background, final Method m, final Object o, final Object... args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    	if (background) {
        	if (backgroundTaskTimer==null) {
        		// we do not create a timer until we need one
        		// potential for 2 exact threads to hit this at the
        		// same time, but that's not an issue.. the timers
        		// will still be invoked.
        		backgroundTaskTimer = new Timer();
        	}

    		backgroundTaskTimer.schedule(new TimerTask() {
				@Override
				public void run() {
					try {
						m.invoke(o, args);
					} catch (IllegalArgumentException e) {
						log.warn("Illegal Argument", e);
					} catch (IllegalAccessException e) {
						log.warn("Illegal Access", e);
					} catch (InvocationTargetException e) {
						log.warn("Invocation Target Exception", e.getTargetException());
					}
				}
			}, 0);
    		
    		return null;
    	} else {
    		return m.invoke(o, args);
    	}
    }

    /**
     * propertChanged is ONLY called when setConfigValue is called with a value
     * that is different than the current value or default. ie, it's only called
     * when a property value changes.
     * 
     * Note, subclasses should not override this method, but rather use the
     * {@link ConfigValueChangeHandler} annotation on methods that need to be
     * notified about config value changes.
     * 
     * The {@link ConfigValueChangeHandler} method can accept either no
     * parameters or just a single string parameter which will be the config
     * setting, not the value.
     * 
     * @param setting
     */
    protected void propertyChanged(String setting) {
        boolean fired = false;
        for (Method m : this.getClass().getMethods()) {
            ConfigValueChangeHandler e = m.getAnnotation(ConfigValueChangeHandler.class);
            try {
                if (e != null && e.value().equals(setting)) {
                    Class cls[] = m.getParameterTypes();
                    m.setAccessible(true);
                    if (cls.length == 0) {
                        m.invoke(this, (Object[]) null);
                        fired = true;
                    } else {
                        if (cls.length == 1) {
                            m.invoke(this, setting);
                            fired = true;
                        }
                    }
                }
            } catch (Exception ex) {
                log.warn("Failed to dispatch change event for: " + setting + " to method " + m.getName() + " in class " + this.getClass().getName(), ex);
            }
        }

        if (!fired) {
            log.warn("Failed to handle ConfigValueChanged event: '" + setting + "' in class: " + this.getClass().getName());
        }
    }

    /**
     * get the help for a given property
     */
    public String getConfigHelpText(String setting) {
        PluginProperty c = getPluginPropertyForSetting(setting);
        if (c == null) return null;
        return c.getHelp();
    }

    /**
     * get the label for a given property
     */
    public String getConfigLabel(String setting) {
        PluginProperty c = getPluginPropertyForSetting(setting);
        if (c == null) return null;
        return c.getLabel();
    }

    /**
     * Get the value list for a given property
     */
    public String[] getConfigOptions(String setting) {
        PluginProperty c = getPluginPropertyForSetting(setting);
        if (c == null) return null;
        return c.getOptions();
    }

    /**
     * Will only return the 'visible' settings.  ie, isVisible() is evalutes for each property, and only those
     * that are visible are returned in this list.
     */
    public String[] getConfigSettings() {
        List<String> settings = new ArrayList<String>();
        for (PluginProperty p : props.values()) {
            boolean visible = true;
            // support old stype visible on setting
            if (p.getVisibleOnSetting() != null) {
                visible = getConfigBoolValue(p.getVisibleOnSetting());
            }
            
            // support new style of visibility handler
            if (visible) {
                visible=p.isVisible();
            }
            
            if (visible) settings.add(p.getSetting());
        }
        return settings.toArray(new String[] {});
    }

    /**
     * get the data type for the given property as defined in {@link SageTVPlugin}
     */
    public int getConfigType(String setting) {
        PluginProperty c = getPluginPropertyForSetting(setting);
        if (c == null) return 0;
        return c.getType();
    }

    /**
     * get the current value for the given property
     */
    public String getConfigValue(String setting) {
        PluginProperty p = getPluginPropertyForSetting(setting);
        if (p != null) {
            return p.getValue();
        }
        return null;
    }

    /**
     * if the property is a value list property, then get it's values as String array.
     */
    public String[] getConfigValues(String setting) {
        PluginProperty p = getPluginPropertyForSetting(setting);
        String s = getConfigValue(setting);
        if (s == null) return null;
        return s.split("\\s*" + p.getValueSep() + "\\s*");
    }

    /**
     * sets all property values to their default values
     */
    public void resetConfig() {
        for (Map.Entry<String, PluginProperty> me : props.entrySet()) {
            setConfigValue(me.getKey(), me.getValue().getDefaultValue());
        }
    }

    /**
     * sets a property value
     */
    public void setConfigValue(String setting, String value) {
        PluginProperty p = getPluginPropertyForSetting(setting);
        if (p == null) return;
        
        if (p.getType()==SageTVPlugin.CONFIG_BUTTON) {
            //p.setValue(value);
            fireButtonClick(setting, value);
            return;
        }
        
        if (p.getValidator()!=null) {
        	try {
				p.getValidator().validate(setting, value);
			} catch (Throwable e) {
				log.warn("Property Validation failed for setting: " + setting + "; value: " + value, e);
				throw new RuntimeException(e.getMessage(), e);
			}
        }
        
        String val = getConfigValue(setting);
        if ((value==null && val!=null) || 
        	 value!=null && !value.equals(val)) {
            p.setValue(value);
            propertyChanged(setting);
        }
    }

    protected void fireButtonClick(String setting, String value) {
        boolean fired = false;
        for (Method m : this.getClass().getMethods()) {
            ButtonClickHandler e = m.getAnnotation(ButtonClickHandler.class);
            try {
                if (e != null && e.value().equals(setting)) {
                    Class cls[] = m.getParameterTypes();
                    m.setAccessible(true);
                    if (cls.length == 0) {
                        m.invoke(this, (Object[]) null);
                        fired = true;
                    } else {
                        m.invoke(this, setting, value);
                        fired = true;
                    }
                }
            } catch (Exception ex) {
                log.warn("Failed to dispatch button event for: " + setting + " to method " + m.getName() + " in class " + this.getClass().getName(), ex);
            }
        }

        if (!fired) {
            log.warn("Failed to handle ButtonClickHandler: '" + setting + "' in class: " + this.getClass().getName());
        }
    }

    /**
     * if set the string array as a property value by serializing the values a string where each value in the array
     * is separated by the value separator, which by default is a semi-colon.  ie, if you pass ing ["A","B","C"], then
     * the serialized string is "A;B;C"
     */
    public void setConfigValues(String setting, String[] values) {
        PluginProperty p = getPluginPropertyForSetting(setting);
        if (values != null) {
            String v = "";
            for (int i = 0; i < values.length; i++) {
                //if (i > 0) v += p.getValueSep();
            	if (v.length()>0) v += p.getValueSep();
                v += values[i];
            }
            setConfigValue(setting, v);
        } else {
            setConfigValue(setting, null);
        }
    }

    /**
     * convenience method to return the given property as an int
     * @param setting
     * @return int value or 0 if it fails
     */
    public int getConfigIntValue(String setting) {
        return TypesUtil.toInt(getConfigValue(setting), 0);
    }

    /**
     * convenience method to return the given property as a boolean value
     * @param setting
     * @return boolean value or false if it fails
     */
    public boolean getConfigBoolValue(String setting) {
        return TypesUtil.toBoolean(getConfigValue(setting), false);
    }
}
