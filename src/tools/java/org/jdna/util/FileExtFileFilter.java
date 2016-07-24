//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.util;

import java.io.File;
import java.io.FileFilter;

public class FileExtFileFilter implements FileFilter {
    private String[] exts;
    private FileFilter dirFilter;

    public FileExtFileFilter(String[] exts, FileFilter dirFilter) {
        this.dirFilter = null;
        this.exts = exts;
        this.dirFilter = dirFilter;
    }

    public FileExtFileFilter(String exts) {
        this((String[])exts.split(","), (FileFilter)null);
    }

    public FileExtFileFilter(String exts, FileFilter dirFilter) {
        this(exts.split(","), dirFilter);
    }

    public boolean accept(File f) {
        if(f.isDirectory()) {
            return this.dirFilter != null?this.dirFilter.accept(f):true;
        } else if(this.exts == null) {
            return true;
        } else {
            String name = f.getName();
            int p = name.lastIndexOf(46);
            if(p == -1) {
                return false;
            } else {
                String ext = name.substring(p);
                String[] var8 = this.exts;
                int var7 = this.exts.length;

                for(int var6 = 0; var6 < var7; ++var6) {
                    String e = var8[var6];
                    if(e.equalsIgnoreCase(ext)) {
                        return true;
                    }
                }

                return false;
            }
        }
    }
}
