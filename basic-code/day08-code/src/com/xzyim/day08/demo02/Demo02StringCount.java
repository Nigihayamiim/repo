package com.xzyim.day08.demo02;

import java.util.Scanner;

public class Demo02StringCount {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母有："+ countUpper);
        System.out.println("小写字母有："+ countLower);
        System.out.println("数字有："+ countNumber);
        System.out.println("其他字符有："+ countOther);
    }
}
