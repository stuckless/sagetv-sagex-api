//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.jdna.util;

import java.io.File;
import java.io.FileFilter;

public class DirExcludeFileFilter implements FileFilter {
    public String[] excludes;

    public DirExcludeFileFilter(String dirs) {
        this(dirs.split(","));
    }

    public DirExcludeFileFilter(String[] dirs) {
        this.excludes = null;
        this.excludes = dirs;
    }

    public boolean accept(File f) {
        if(f.isFile()) {
            return false;
        } else if(this.excludes == null) {
            return true;
        } else {
            String[] var5 = this.excludes;
            int var4 = this.excludes.length;

            for(int var3 = 0; var3 < var4; ++var3) {
                String d = var5[var3];
                if(d.equals(f.getName())) {
                    return false;
                }
            }

            return true;
        }
    }
}
