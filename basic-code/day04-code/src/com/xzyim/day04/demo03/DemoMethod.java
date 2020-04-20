package com.xzyim.day04.demo03;

public class DemoMethod {

    public static void main(String[] args) {
        printHello(3);
    }

    public static boolean issame(double a,double b){
        /*if(a==b){
            return true;
        }else {
            return false;
        }*/
        /*boolean same = a == b;
        return  same;*/
        return  a == b;
    }

    public  static  int  sumHundred(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printHello(int i){
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println("Hello,World!");
        }
    }

}
