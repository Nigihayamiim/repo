package com.xzy.thread.thread;

public class ThreadSon extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("这是第"+i+"次循环");
        }
        String name = getName();
        System.out.println(name);
    }
}
