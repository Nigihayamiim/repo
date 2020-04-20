package com.xzy.InnerClass.day09.demo02;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {

        Manager qz = new Manager("群主",100);
        Member qy1 = new Member("群员1",0);
        Member qy2 = new Member("群员2",0);
        Member qy3 = new Member("群员3",0);

        qz.show();
        qy1.show();
        qy2.show();
        qy3.show();
        System.out.println("====================");


        ArrayList<Double> redList = qz.send(32,3);

        qy1.receive(redList);
        qy2.receive(redList);
        qy3.receive(redList);

        qz.show();
        qy1.show();
        qy2.show();
        qy3.show();

    }

}
