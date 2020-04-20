package com.xzy.InnerClass.day09.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> list){

        double leftMoney = super.getMoney();

        int index = new Random().nextInt(list.size());

        double delta = list.remove(index);

        super.setMoney(leftMoney + delta);


    }
}
