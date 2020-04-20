package com.xzyim.day07.demo03;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();

        Random ran = new Random();
        for (int i = 0; i < 20; i++) {

            int itr = ran.nextInt(33) + 1;
            blist.add(itr);
            if (itr % 2 == 0) {
                list.add(itr);
            }
        }

        System.out.println("偶数：" + list +" 个数：" + list.size());
        System.out.println("全20数:" + blist);

        /*for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }*/
    }

}
