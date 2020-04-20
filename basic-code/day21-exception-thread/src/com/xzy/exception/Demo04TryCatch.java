package com.xzy.exception;

import java.io.FileNotFoundException;

public class Demo04TryCatch {

    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            readFile("c:\\atxt");
        }catch (FileNotFoundException e){
            //异常的处理逻辑
            System.out.println(e.getMessage());
        }
    }

    /*public static void readFile(String fileName) {
        if (!fileName.equals("c:\\a.txt")){
            try {
                throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
            } catch (Exception e) {
               e.printStackTrace();
            }
        }else
        System.out.println("读取成功");
    }*/

    public static void readFile(String fileName) throws FileNotFoundException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        System.out.println("读取成功");
    }

}
