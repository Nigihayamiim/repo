package com.xzy.redenvelope.Sendredenvelope;

import com.xzy.redenvelope.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount-1 ; i++) {
            int money;
            if (leftMoney % leftCount > 0){
                money = new Random().nextInt(leftMoney / leftCount * 2) + 1;
            }else {
                money = new Random().nextInt(leftMoney / leftCount * 2 - 1) + 1;
            }

            leftMoney -= money;
            leftCount--;
            list.add(money);
        }
        list.add(leftMoney);

        return list;
    }
}
