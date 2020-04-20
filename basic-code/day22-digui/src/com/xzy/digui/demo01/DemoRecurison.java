package com.xzy.digui.demo01;

public class DemoRecurison {

    public static void main(String[] args) {

        System.out.println(sum(5));
        System.out.println(cheng(4));
    }


    public static int sum(int n){

        if (n==1){
            return n;
        }

        return n + sum(n-1);
    }

    public static int cheng(int n){
        if (n==1){
            return n;
        }

        return n * cheng(n-1);
    }

}
