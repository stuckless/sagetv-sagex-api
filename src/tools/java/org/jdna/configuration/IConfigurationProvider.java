//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.configuration;

import java.io.IOException;

public interface IConfigurationProvider {
    String getName();

    String getProperty(String var1);

    void setProperty(String var1, String var2);

    String[] getKeys();

    void save() throws IOException;

    String getPersistentUri();
}
