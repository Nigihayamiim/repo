package com.xzy.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhuMode{

    public ArrayList<String> maiPai(){
        String[] colors ={"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        ArrayList<String> poker = new ArrayList<>();

        poker.add("大王");
        poker.add("小王");

        for (String number: numbers) {
            for (String color : colors){
                String p = color + number;
                poker.add(p);
            }
        }
        System.out.println("买好牌了");
        return poker;
    }

    public ArrayList<String> xiPai(ArrayList<String> poker){
        Collections.shuffle(poker);
        System.out.println("洗牌完毕");
        return poker;
    }

    public void zhuaPai(ArrayList<String> poker,ArrayList<String> wanjia1
            ,ArrayList<String> wanjia2,ArrayList<String> wanjia3,ArrayList<String> dipai){

        for (int index = 0; index < poker.size(); index++) {
            String p = poker.get(index);
            if (index > 51){
               dipai.add(p);
            }else if (index % 3 == 0){
                wanjia1.add(p);
            }else if (index % 3 == 1){
                wanjia2.add(p);
            }else {
                wanjia3.add(p);
            }
        }
        System.out.println("抓拍完毕");
    }

    public void jiaoDiZhu(ArrayList<String> wanjia,ArrayList<String> dipai){
        wanjia.addAll(dipai);
        System.out.println("叫地主成功");
    }

    public void kanPai(ArrayList<String> wanjia){
        System.out.println("您的手牌是： ");
        for (String s : wanjia){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
