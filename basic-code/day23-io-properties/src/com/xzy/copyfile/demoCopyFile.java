package com.xzy.copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demoCopyFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\Users\\AlgaeBFairy\\Pictures\\Camera Roll\\CmQUOFk0i_CES6miAAAAAHKabEQ526497538.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\1.jpg");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();

    }

}
