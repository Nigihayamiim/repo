package com.xzy.InnerClass.Iterface.demoDefault;

public interface MyInterfaceDefault {

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("方法二执行");
}

}
