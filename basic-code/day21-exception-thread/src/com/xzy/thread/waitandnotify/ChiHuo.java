package com.xzy.thread.waitandnotify;

public class ChiHuo extends Thread {

    private BaoZi bz;

    public ChiHuo(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {

        while (true){
            synchronized (bz) {
                if (bz.cunHuo == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


                System.out.println("吃货开始吃" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.cunHuo = false;
                bz.notify();
                System.out.println("包子吃完了,赶紧开始做");

            }
        }

    }
}
