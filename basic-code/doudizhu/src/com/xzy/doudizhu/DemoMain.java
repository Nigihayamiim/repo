package com.xzy.doudizhu;

import java.util.ArrayList;

public class DemoMain {

    public static void main(String[] args) {

        ArrayList<String> wanjia1 = new ArrayList<>();
        ArrayList<String> wanjia2 = new ArrayList<>();
        ArrayList<String> wanjia3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        DouDiZhuMode douDiZhuMode = new DouDiZhuMode();
        ArrayList<String> pai = douDiZhuMode.maiPai();
        ArrayList<String> pai1 = douDiZhuMode.xiPai(pai);
        douDiZhuMode.zhuaPai(pai1,wanjia1,wanjia2,wanjia3,dipai);
        douDiZhuMode.jiaoDiZhu(wanjia1,dipai);
        douDiZhuMode.kanPai(wanjia1);
        douDiZhuMode.kanPai(wanjia2);
        douDiZhuMode.kanPai(wanjia3);

    }

}
