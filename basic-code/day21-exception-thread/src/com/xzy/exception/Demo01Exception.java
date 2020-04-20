package com.xzy.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse("2019-12-12");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

}
