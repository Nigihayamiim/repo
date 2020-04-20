package com.xzy.InnerClass.day09.demo02;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {

    }

    public Manager(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> send(double totalMoney, int count){

        ArrayList<Double> redList = new ArrayList<>();

        double leftMoney = super.getMoney();

        if(totalMoney > leftMoney){
            System.out.println("对不起，您的余额不足！");
            return redList;
        }

        int TotalMoney = (int)(totalMoney * 100);
        int avg0 = TotalMoney / count;
        double avg = avg0 / 100.0;
        int mod0 = TotalMoney % count;
        double mod = mod0 / 100.0;

        super.setMoney(leftMoney - totalMoney);

        for (int i = 0; i < count-1 ; i++) {
            redList.add(avg);
        }

        double last = avg + mod;
        redList.add(last);

        return redList;
    }
}
