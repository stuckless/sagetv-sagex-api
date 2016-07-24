//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jdna.configuration.ConfigurationManager;
import org.jdna.url.ICookieHandler;
import org.jdna.url.IUrl;
import org.jdna.url.Url;
import org.jdna.util.IOUtils;

public class CachedUrl extends Url implements IUrl {
    private static final Logger log = Logger.getLogger(CachedUrl.class);
    private File propFile = null;
    private Properties props = null;
    public File urlCacheDir = null;

    public CachedUrl(String url) throws IOException {
        super(url);
        String cachedFileName = this.getCachedFileName(url);
        this.propFile = new File(this.getCacheDir(), cachedFileName + ".properties");
        this.props = new Properties();
        File f;
        if(this.propFile.exists()) {
            log.debug("Reloading existing cached url: " + this.propFile.getAbsolutePath());
            this.props.load(new FileInputStream(this.propFile));
            f = this.getCachedFile();
            if(f.exists() && this.isExpired(f)) {
                log.debug("Expiring Cached Url File: " + f.getAbsolutePath());
                f.delete();
            }
        } else {
            f = this.propFile.getParentFile();
            f.mkdirs();
            log.debug("Creating a new cached url for: " + url);
            this.props.setProperty("url", url);
            this.props.setProperty("file", this.createCachedFile());
        }

        if(!url.equals(this.props.getProperty("url"))) {
            throw new IOException("Caching is messed up.  The Cached url does not match the one passed! " + this.props.getProperty("url") + " != " + url);
        }
    }

    private String getCachedFileName(String url) {
        try {
            URL e = new URL(url);
            String path = e.getPath();
            String q = e.getQuery();
            if(q == null) {
                return path;
            } else {
                String name = q.replaceAll("[^a-zA-Z0-9]+", "_");
                return path + "_" + name;
            }
        } catch (MalformedURLException var6) {
            log.error("Failed to create cached filename for url: " + url, var6);
            throw new RuntimeException(var6);
        }
    }

    private boolean isExpired(File cachedFile) {
        long secs = Long.parseLong(ConfigurationManager.getInstance().getProperty("org.jdna.url.CachedUrl.expireSeconds", String.valueOf(86400)));
        long diff = System.currentTimeMillis() / 1000L - cachedFile.lastModified();
        return diff > secs;
    }

    private File getCacheDir() {
        if(this.urlCacheDir == null) {
            this.urlCacheDir = new File(ConfigurationManager.getInstance().getProperty("org.jdna.url.CachedUrl.cacheDir", "cache/url/"));
            if(!this.urlCacheDir.exists()) {
                this.urlCacheDir.mkdirs();
            }
        }

        return this.urlCacheDir;
    }

    private String createCachedFile() throws IOException {
        File f = File.createTempFile(this.propFile.getName(), ".cache", this.propFile.getParentFile());
        f.delete();
        return f.getCanonicalPath();
    }

    public URL getOriginalUrl() throws IOException {
        return new URL(this.props.getProperty("url"));
    }

    public File getPropertyFile() {
        return this.propFile;
    }

    public File getCachedFile() {
        return new File(this.props.getProperty("file"));
    }

    public boolean hasMoved() {
        return Boolean.parseBoolean(this.props.getProperty("moved", "false"));
    }

    public URL getMovedUrl() throws IOException {
        return new URL(this.props.getProperty("movedUrl"));
    }

    public URL getUrl() throws IOException {
        return this.getUrl((ICookieHandler)null);
    }

    public URL getUrl(ICookieHandler handler) throws IOException {
        File f = this.getCachedFile();
        if(!f.exists()) {
            this.cache(handler);
        } else {
            log.debug("Cached File exists: " + f.getAbsolutePath() + " so we\'ll just use it.");
        }

        return f.toURI().toURL();
    }

    public void cache(ICookieHandler handler) throws IOException {
        log.debug("Caching Url: " + this.getOriginalUrl().toExternalForm());
        URL u = this.getOriginalUrl();
        URLConnection c = u.openConnection();
        this.sendCookies(u, c, handler);
        if(c instanceof HttpURLConnection) {
            HttpURLConnection conn = (HttpURLConnection)c;
            conn.setInstanceFollowRedirects(false);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.1) Gecko/2008072820 Firefox/3.0.1");
            InputStream is = conn.getInputStream();
            int rc = conn.getResponseCode();
            if(rc != 301 && rc != 302) {
                if(rc != 200) {
                    throw new IOException("Http Response Code: " + rc + "; Message: " + conn.getResponseMessage());
                }

                this.handleCookies(u, c, handler);
                File f2 = this.getCachedFile();
                IOUtils.copyStream(is, new FileOutputStream(f2));
                log.debug("Url " + u.toExternalForm() + " Cached To: " + f2.getAbsolutePath());
            } else {
                this.props.setProperty("moved", "true");
                String f = conn.getHeaderField("Location");
                if(f != null) {
                    int f1 = f.indexOf(63);
                    if(f1 != -1) {
                        f = f.substring(0, f1);
                    }

                    this.props.setProperty("movedUrl", f);
                }

                File f3 = this.getCachedFile();
                IOUtils.copyStream(is, new FileOutputStream(f3));
                log.debug("Url " + u.toExternalForm() + " Cached To: " + f3.getAbsolutePath());
                log.debug(String.format("Url: %s moved to %s", new Object[]{u.toExternalForm(), f}));
            }
        } else {
            log.warn("Cannot Cache Url Connection Type; " + c.getClass().getName());
        }

        this.props.store(new FileOutputStream(this.getPropertyFile()), "Cached Url Properties");
        log.debug("Properties for cached url are now stored: " + this.getPropertyFile().getAbsolutePath());
    }

    public InputStream getInputStream(ICookieHandler handler) throws IOException {
        URL u = this.getUrl(handler);
        return u.openStream();
    }

    public static void remove(String dataUrl) {
        try {
            new CachedUrl(dataUrl);
        } catch (IOException var2) {
            log.error("Unabled to remove cached data url: " + dataUrl);
        }

    }

    private void remove() {
        try {
            log.debug("Removing Cached Url: " + this.getOriginalUrl().toExternalForm());
            if(this.props != null) {
                File f = this.getCachedFile();
                if(f.exists()) {
                    log.debug("Removing Cached File: " + f.getAbsolutePath());
                    f.delete();
                }
            }
        } catch (IOException var2) {
            ;
        }

    }
}
