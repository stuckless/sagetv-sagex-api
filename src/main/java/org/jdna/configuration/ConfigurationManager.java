package org.jdna.configuration;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

public class ConfigurationManager {
    private static final Logger log = Logger.getLogger(ConfigurationManager.class);
    private static ConfigurationManager instance;
    public IConfigurationProvider config = null;

    public static ConfigurationManager getInstance() {
        if(instance == null) {
            instance = new ConfigurationManager((IConfigurationProvider)null);
        }

        return instance;
    }

    public ConfigurationManager(IConfigurationProvider conf) {
        if(conf == null) {
            log.error("Configuration Manager is being initialized WITHOUT a valid properties set.");
            conf = new PropertiesConfigurationProvider((File)null, new Properties());
        } else {
            log.info("Configuration manager is setting a new Configuration Provider");
        }

        this.setProvider((IConfigurationProvider)conf);
    }

    public void setProvider(IConfigurationProvider conf) {
        log.info("Setting Configuration Provider: " + conf.getName());
        this.config = conf;
    }

    public String getProperty(String key, String def) {
        String v = this.config.getProperty(key);
        return v == null?def:v;
    }

    public String getProperty(String key) {
        return this.getProperty(key, (String)null);
    }

    public IConfigurationProvider getProvider() {
        return this.config;
    }

    public void save() throws IOException {
        this.config.save();
    }
}
