package com.xzyim.day08.demo01;

public class DemoStringGet {

    public static void main(String[] args) {

        String str = "1";
        String str2 = "2";
        String str3 = "sjfklsajdkf";

        String str0 = str.concat(str2).concat(str3);

        System.out.println(str0);

        System.out.println(str0.indexOf('s'));

        System.out.println(str0.substring(6,9));

    }


}
