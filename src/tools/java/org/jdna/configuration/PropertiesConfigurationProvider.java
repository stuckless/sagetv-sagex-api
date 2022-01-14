//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.configuration;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jdna.configuration.IConfigurationProvider;

public class PropertiesConfigurationProvider implements IConfigurationProvider {
    private static final Logger log = Logger.getLogger(PropertiesConfigurationProvider.class);
    private Properties props;
    private File persistentStore;

    public PropertiesConfigurationProvider(File persistentStore, Properties defaultProps) {
        try {
            this.load(persistentStore, defaultProps);
        } catch (IOException var4) {
            log.error("Failed to load properties!!! May experience some issues.", var4);
        }

    }

    private void load(File persistentStore, Properties defaultProps) throws IOException {
        this.persistentStore = persistentStore;
        if(defaultProps == null) {
            this.props = new Properties();
        } else {
            this.props = defaultProps;
        }

        Properties mainProps = new Properties(this.props);
        if(persistentStore != null && persistentStore.exists()) {
            mainProps.load(new FileReader(persistentStore));
        }

        this.props = mainProps;
    }

    public PropertiesConfigurationProvider(Properties props) {
        this((File)null, props);
    }

    public PropertiesConfigurationProvider(File persistentStore) {
        this(persistentStore, (Properties)null);
    }

    public String getProperty(String key) {
        return System.getProperty(key, this.props.getProperty(key));
    }

    public void load(InputStream is) throws IOException {
        this.props.load(is);
    }

    public void save(OutputStream os) throws IOException {
        this.props.store(os, "ConfigurationManager Properties");
    }

    public String getName() {
        return this.getClass().getName();
    }

    public String[] getKeys() {
        Enumeration keys = this.props.propertyNames();
        ArrayList l = new ArrayList();

        while(keys.hasMoreElements()) {
            l.add((String)keys.nextElement());
        }

        return (String[])l.toArray(new String[l.size()]);
    }

    public String getPersistentUri() {
        return this.persistentStore != null?null:this.persistentStore.toURI().toString();
    }

    public void save() throws IOException {
        if(this.persistentStore == null) {
            throw new IOException("Persistent Store not Defined.");
        } else {
            this.props.store(new FileWriter(this.persistentStore), "Saved: " + SimpleDateFormat.getDateInstance().format(new Date()));
        }
    }

    public void setProperty(String key, String value) {
        this.props.setProperty(key, value);
    }
}