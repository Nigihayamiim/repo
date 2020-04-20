package com.xzyim.day04.demo02;


public class Demo01Method {
    public static void main(String[] args) {
        printMethod();

        System.out.println(sumQiuhe(2,5));
    }
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sumQiuhe(int i,int j){
        return i + j ;
    }
}
