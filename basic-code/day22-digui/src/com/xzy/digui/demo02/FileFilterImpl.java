package com.xzy.digui.demo02;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()){
            return true;
        }
        return f.toString().toLowerCase().endsWith(".java");
    }
}
