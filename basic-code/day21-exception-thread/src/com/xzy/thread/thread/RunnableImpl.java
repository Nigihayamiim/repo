package com.xzy.thread.thread;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("这是第"+i+"次循环");
        }
    }
}
