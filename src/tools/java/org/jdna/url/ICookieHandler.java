//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.url;

import java.util.Map;

public interface ICookieHandler {
    void handleSetCookie(String var1, String var2);

    Map<String, String> getCookiesToSend(String var1);
}
