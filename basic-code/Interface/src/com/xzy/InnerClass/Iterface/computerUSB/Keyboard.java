package com.xzy.InnerClass.Iterface.computerUSB;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void qiaoji(){
        System.out.println("敲击键盘");
    }
}
