package com.xzy.redenvelope.Sendredenvelope;

import com.xzy.redenvelope.red.RedPacketFrame;

public class Bootstrap {

    public static void main(String[] args) {
        RedPacketFrame red = new MyRed("发红包啦");
        red.setOwnerName("赈藻见");

        //red.setOpenWay(new NormalMode());
        red.setOpenWay(new RandomMode());
    }

}
