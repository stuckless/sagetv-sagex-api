//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import org.apache.log4j.Logger;
import org.htmlparser.sax.XMLReader;
import org.jdna.url.CookieHandler;
import org.jdna.url.IUrl;
import org.jdna.url.UrlFactory;
import org.jdna.util.AbstractSaxHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class URLSaxParser extends AbstractSaxHandler {
    private static final Logger log = Logger.getLogger(URLSaxParser.class);
    protected String url = null;
    protected boolean followRedirects = false;
    protected boolean isRedirecting = false;
    protected String redirectUrl = null;

    public URLSaxParser(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void parse() throws IOException, SAXException {
        this.parse((CookieHandler)null);
    }

    public void parse(CookieHandler cookieHandler) throws IOException, SAXException {
        XMLReader reader = new XMLReader();
        reader.setContentHandler(this);
        reader.setErrorHandler(this);
        log.info("Parsing Url: " + this.url);
        IUrl urlFacade = UrlFactory.newUrl(this.url);

        try {
            InputStream e = urlFacade.getInputStream(cookieHandler);
            if(urlFacade.hasMoved()) {
                this.isRedirecting = true;
                this.redirectUrl = urlFacade.getMovedUrl().toExternalForm();
            } else {
                reader.parse(new InputSource(e));
            }

        } catch (IOException var7) {
            throw var7;
        } catch (Exception var8) {
            throw new IOException("Failed to open connection: " + this.url, var8);
        }
    }

    public boolean isTag(String tag1, String tag2) {
        return tag1 != null && tag1.equalsIgnoreCase(tag2);
    }

    public String attr(Attributes atts, String aName) {
        String val = atts.getValue(aName);
        return val == null?"":val;
    }

    public boolean attrContains(Attributes atts, String aName, String aContains) {
        return this.attr(atts, aName).contains(aContains);
    }

    public boolean isRedirecting() {
        return this.isRedirecting;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public void setFollowRedirects(boolean followRedirects) {
        this.followRedirects = followRedirects;
    }

    public String getCharacters(char[] ch, int start, int length) {
        String charbuf = null;

        try {
            charbuf = new String(ch, start, length);

            try {
                charbuf = URLDecoder.decode(charbuf, "UTF-8");
            } catch (Exception var6) {
                ;
            }

            charbuf = charbuf.trim();
            charbuf = charbuf.replaceAll("&nbsp;", " ");
            charbuf = charbuf.replaceAll("&[#0-9a-zA-Z]+;", "");
        } catch (Throwable var7) {
            log.error("There was a problem getting a string from the char array!; buffer as known: " + charbuf, var7);
        }

        if(log.isDebugEnabled() && charbuf != null && charbuf.length() > 0) {
            log.debug("CharBuffer:[" + charbuf + "]");
        }

        return charbuf;
    }
}
