//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.jdna.url.ICookieHandler;

public interface IUrl {
    URL getUrl() throws IOException;

    URL getMovedUrl() throws IOException;

    boolean hasMoved();

    InputStream getInputStream(ICookieHandler var1) throws IOException;
}
