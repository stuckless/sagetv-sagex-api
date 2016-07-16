//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class UrlUtil {
    private static final Logger log = Logger.getLogger(UrlUtil.class);

    public UrlUtil() {
    }

    public static String getBaseUrl(String url) {
        String path = getPathName(url);
        if(path != null && path.contains("/")) {
            path = path.substring(0, path.lastIndexOf("/"));
        }

        return getDomainUrl(url) + path;
    }

    public static String getDomainUrl(String url) {
        try {
            URL u = new URL(url);
            return String.format("%s://%s/", new Object[]{u.getProtocol(), u.getHost()});
        } catch (MalformedURLException var3) {
            log.error("Failed to get domain url for: " + url);
            return null;
        }
    }

    public static String joinUrlPath(String baseUrl, String path) {
        StringBuffer sb = new StringBuffer(baseUrl);
        if(baseUrl.endsWith("/") && path.startsWith("/")) {
            path = path.substring(1);
        }

        sb.append(path);
        return sb.toString();
    }

    public static String getPathName(String url) {
        try {
            URL u = new URL(url);
            return u.getPath();
        } catch (MalformedURLException var3) {
            log.error("getPathName() Failed! " + url, var3);
            return null;
        }
    }
}
