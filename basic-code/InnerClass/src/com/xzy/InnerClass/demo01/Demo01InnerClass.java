package com.xzy.InnerClass.demo01;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部类Heart
        body.methodBody();
        System.out.println("======================");

        //直接调用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
