package com.xzy.exception;

import java.util.Scanner;

public class Demo06RegisterException {

    static String[] usernames = {"张三","梨死","王二"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的注册名:");
        String name = sc.next();
        try {
            panDuan(name);
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    public static void panDuan(String name) throws RegisterException {
        for (String userna : usernames) {
            if (name.equals(userna)){
                throw new RegisterException("该用户名已被注册");
            }
        }
        System.out.println("注册成功");
    }



}
