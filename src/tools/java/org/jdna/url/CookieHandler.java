//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jdna.url.ICookieHandler;
import org.jdna.url.Url;

public class CookieHandler implements ICookieHandler {
    private static final Logger log = Logger.getLogger(CookieHandler.class);
    private Map<String, String> cookies = new HashMap();
    private String cookieUrl = null;
    private boolean lookingForCookies = true;

    public CookieHandler(String cookieUrl) {
        this.cookieUrl = cookieUrl;
    }

    public Map<String, String> getCookiesToSend(String url) {
        log.debug("getCookies called on url: " + url);
        if(this.cookies.size() == 0 && this.lookingForCookies) {
            log.debug("We don\'t have a cookie, so we\'ll try and get them from: " + this.cookieUrl);
            this.lookingForCookies = false;
            Url u = new Url(this.cookieUrl);

            try {
                u.getInputStream(this);
            } catch (IOException var4) {
                ;
            }
        }

        return this.cookies;
    }

    public void handleSetCookie(String url, String cookie) {
        log.debug(String.format("Handlin Cookies: Url: %s; Cookie: %s\n", new Object[]{url, cookie}));
        Pattern p = Pattern.compile("([^ =:]+)=([^;]+)");
        Matcher m = p.matcher(cookie);
        if(m.find()) {
            this.cookies.put(m.group(1), m.group(2));
        }

    }
}
