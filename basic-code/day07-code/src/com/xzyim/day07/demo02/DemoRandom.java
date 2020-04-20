package com.xzyim.day07.demo02;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {

    public void Game() {

        System.out.println("请输入范围最大数");
        int num = new Scanner(System.in).nextInt();
        System.out.println("请输入初始猜测次数");
        int cishu = new Scanner(System.in).nextInt();
        Random r = new Random();
        int i1 = r.nextInt(num+1);
        int i = 1;
        while (i <= cishu) {
            System.out.println("请输入0-" + num + "的随机数");
            int n = new Scanner(System.in).nextInt();
            if (n == i1) {
                System.out.println("恭喜你猜对了，用了这么多次 " + i);
                break;
            } else if (n != i1 && i == cishu) {
                System.out.println("哦豁，机会没得了");
            } else if (n < i1) {
                System.out.println("小了，再大点，还剩" + (cishu - i) + "次机会。");
            } else if (n > i1) {
                System.out.println("大了，再小点，还剩" + (cishu - i) + "次机会。");
            }
            /*else{
                System.out.println("差一点点答对，还剩"+(cishu-i)+"次机会。");
            }*/
            i++;
        }
        System.out.println("是否继续游戏？ y/n");
        String s = new Scanner(System.in).next();
        if ("y".equalsIgnoreCase(s)) {
            this.Game();
        } else if ("n".equalsIgnoreCase(s)) {
            System.out.println("感谢游玩！");
        } else {
            System.out.println("瞎输？拜拜了您呢~");
        }

    }

}
