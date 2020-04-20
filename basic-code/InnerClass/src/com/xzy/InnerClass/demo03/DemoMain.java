package com.xzy.InnerClass.demo03;

public class DemoMain {

    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("这就是一个匿名内部类");
            }
        };

        obj.method();
    }

}
