//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import org.apache.log4j.Logger;
import org.jdna.configuration.ConfigurationManager;
import org.jdna.url.IUrl;
import org.jdna.url.IUrlFactory;
import org.jdna.url.Url;

public class UrlFactory implements IUrlFactory {
    private static final Logger log = Logger.getLogger(UrlFactory.class);
    private static IUrlFactory factory;

    public UrlFactory() {
    }

    public static IUrl newUrl(String url) {
        if(factory == null) {
            createFactory();
        }

        try {
            return factory.createUrl(url);
        } catch (Exception var2) {
            log.error("Factory failed to create a url from the factory, so we are returning default url.", var2);
            return new Url(url);
        }
    }

    private static void createFactory() {
        try {
            String t = ConfigurationManager.getInstance().getProperty("org.jdna.url.UrlFactory.factoryClass", "org.jdna.url.CachedUrlFactory");
            if(t == null) {
                factory = new UrlFactory();
            } else {
                factory = (IUrlFactory)Class.forName(t).newInstance();
            }
        } catch (Throwable var1) {
            log.error("Failed to create IUrlFactory! Using Default.", var1);
            factory = new UrlFactory();
        }

    }

    public IUrl createUrl(String url) {
        return new Url(url);
    }
}
