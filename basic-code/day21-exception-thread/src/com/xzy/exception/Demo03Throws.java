package com.xzy.exception;

import java.io.FileNotFoundException;

public class Demo03Throws {

    public static void main(String[] args) throws FileNotFoundException {
        readFile("c:\\a.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        System.out.println("读取成功");
    }

}
