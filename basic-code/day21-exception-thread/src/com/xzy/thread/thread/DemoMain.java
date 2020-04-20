package com.xzy.thread.thread;

public class DemoMain {

    public static void main(String[] args) {

        /*Thread son = new ThreadSon();
        son.start();*/

        new Thread(new RunnableImpl() {
            public void run(){
                for (int i = 0; i <5 ; i++) {
                    System.out.println("这是第"+i+"次循环");
                }
            }
        }).start();

        /*RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();*/

        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName());
    }

}
