package com.xzy.InnerClass.Iterface.demoDefault;

public class MyInterfaceDefaultImpl2 implements MyInterfaceDefault {


    @Override
    public void methodAbs() {
        System.out.println("方法一执行");
    }

    @Override
    public void methodDefault() {
        System.out.println("重写了方法二");
    }
}
