package com.xzy.lambda.demo01;

public class Demo01Lambda {

    public static void main(String[] args) {
        /*new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("这是方法1");
            }
        }).start();*/


        /*new Thread(() -> {
            System.out.println("这是方法2");
        }).start();*/

        new Thread(() ->
            System.out.println("这是方法2")
        ).start();
    }

}
