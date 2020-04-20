package com.xzy.digui.demo02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class DemoWJJDiGui {

    public static void main(String[] args) {

        File file = new File("D:\\Users\\AlgaeBFairy\\OneDrive\\IdeaProjects\\basic-code\\day22-digui");

        wenJianJia(file);
    }

    public static void wenJianJia(File file){
        /*if (file.isDirectory()){
            File[] list = file.listFiles();
            for (File s : list){
                System.out.println(s);
                wenJianJia(s);
            }
        }*/


//        System.out.println(file);
        /*File[] files = file.listFiles(new FileFilterImpl());
        for (File f : files){
            if (f.isDirectory()){
                wenJianJia(f);
            }else {
                System.out.println(f);
            }
        }*/


        /*File[] files = file.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getPath().toLowerCase().endsWith(".java");
            }
        });
        for (File f : files){
            if (f.isDirectory()){
                wenJianJia(f);
            }else {
                System.out.println(f);
            }
        }*/


        File[] files = file.listFiles(
                (File dir, String name) -> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java")
        );
        for (File f : files){
            if (f.isDirectory()){
                wenJianJia(f);
            }else {
                System.out.println(f);
            }
        }
    }

}
