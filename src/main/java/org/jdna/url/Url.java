//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jdna.url.ICookieHandler;
import org.jdna.url.IUrl;

public class Url implements IUrl {
    private Logger log = Logger.getLogger(Url.class);
    private String url = null;

    public Url(String url) {
        this.url = url;
    }

    public URL getMovedUrl() throws IOException {
        return null;
    }

    public URL getUrl() throws IOException {
        return new URL(this.url);
    }

    public boolean hasMoved() {
        return false;
    }

    protected void sendCookies(URL url, URLConnection conn, ICookieHandler handler) {
        if(handler != null) {
            Map cookies = handler.getCookiesToSend(url.toExternalForm());
            if(cookies != null) {
                Iterator var6 = cookies.keySet().iterator();

                while(var6.hasNext()) {
                    String key = (String)var6.next();
                    this.log.debug("Sending Cookie: " + key + "=" + (String)cookies.get(key) + " to " + url.toExternalForm());
                    conn.setRequestProperty("Cookie", String.format("%s=%s", new Object[]{key, cookies.get(key)}));
                }
            }
        }

    }

    public InputStream getInputStream(ICookieHandler handler) throws IOException {
        URL u = this.getUrl();
        URLConnection conn = u.openConnection();
        this.sendCookies(u, conn, handler);
        InputStream is = conn.getInputStream();
        this.handleCookies(u, conn, handler);
        return is;
    }

    protected void handleCookies(URL u, URLConnection conn, ICookieHandler handler) {
        if(handler != null) {
            String headerName = null;

            for(int i = 1; (headerName = conn.getHeaderFieldKey(i)) != null; ++i) {
                if(headerName.equals("Set-Cookie")) {
                    String cookie = conn.getHeaderField(i);
                    handler.handleSetCookie(u.toExternalForm(), cookie);
                }
            }
        }

    }
}
