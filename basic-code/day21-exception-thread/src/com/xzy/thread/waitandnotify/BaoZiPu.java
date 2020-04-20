package com.xzy.thread.waitandnotify;

public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(BaoZi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if(bz.cunHuo == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count % 2 ==0){
                    bz.pi = "薄皮";
                    bz.xian = "酱肉";
                }else {
                    bz.pi = "冰皮";
                    bz.xian = "鲜肉";
                }
                count++;
                System.out.println("包子铺正在生产"+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.cunHuo = true;
                System.out.println("包子生产好了:"+bz.pi+bz.xian);
                bz.notify();

            }
        }

    }
}
