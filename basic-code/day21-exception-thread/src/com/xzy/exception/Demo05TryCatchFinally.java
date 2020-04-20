package com.xzy.exception;

import java.io.FileNotFoundException;

public class Demo05TryCatchFinally {

    public static void main(String[] args) {
        try {
            readFile("c:\\atxt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            //无论是否有异常都会执行
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        System.out.println("读取成功");
    }

}
