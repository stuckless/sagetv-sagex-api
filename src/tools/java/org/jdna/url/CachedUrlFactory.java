//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.IOException;
import org.jdna.url.CachedUrl;
import org.jdna.url.IUrl;
import org.jdna.url.IUrlFactory;

public class CachedUrlFactory implements IUrlFactory {
    public CachedUrlFactory() {
    }

    public IUrl createUrl(String url) throws IOException {
        return new CachedUrl(url);
    }
}
