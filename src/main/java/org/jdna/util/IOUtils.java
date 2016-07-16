//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
    public IOUtils() {
    }

    public static void copyStream(InputStream is, OutputStream os) throws IOException {
        byte[] buf = new byte[4096];
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int s;
        try {
            while((s = bis.read(buf)) > 0) {
                bos.write(buf, 0, s);
            }
        } finally {
            try {
                bos.flush();
            } catch (Exception var11) {
                ;
            }

        }

    }
}
