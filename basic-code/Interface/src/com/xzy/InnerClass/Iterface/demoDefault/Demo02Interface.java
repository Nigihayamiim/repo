package com.xzy.InnerClass.Iterface.demoDefault;

public class Demo02Interface {

    public static void main(String[] args) {

        MyInterfaceDefaultImpl impl = new MyInterfaceDefaultImpl();

        impl.methodAbs();
        impl.methodDefault();

        MyInterfaceDefaultImpl2 impl2 = new MyInterfaceDefaultImpl2();

        impl2.methodAbs();
        impl2.methodDefault();

    }

}
