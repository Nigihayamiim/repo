package com.test;

import java.util.Scanner;

public class jichu_test {

    public static void main(String[] args){

//        suanshu();
//        int n = 6;
//        for (int i = 0; i < n ; i++) {
//            for (int k = n-1; k > i  ; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2*i+1 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


////        while循环
//        int i = 1;
//        int sum = 0;
//        while(i<=100){
//            sum +=i;
//            i++;
//        }
//        System.out.println(sum);

        String[] stu ={"haoyoa","haoer","yoshi"};
        for (String st:stu
             ) {
            String str = st.substring(0,2);
            String[] str1 = st.split("o");
            for (String st1:str1
                 ) {
                System.out.println(st1);
            }
            //System.out.println(str);
        }


    }

    public static void suanshu(){

        System.out.println("现在进行简单算数"+"\n"+"请输入第一个数字:");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        String a = sc.nextLine();
        System.out.println(one+"\n"+"请输入运算符:");
        String s = sc.nextLine();
        System.out.println("请输入第二个数字");
        int i = sc.nextInt();
        if(s.equals("*")){
            System.out.println("结果为:"+one * i);
        }else if(s.equals("/")){
            System.out.println("结果为:"+one / i);
        }else if(s.equals("+")){
            System.out.println("结果为:"+one + i);
        }else if(s.equals("-")){
            int result = one - i;
            System.out.println("结果为:"+result);
        }else{
            System.out.println("错误");
        }
    }
}
