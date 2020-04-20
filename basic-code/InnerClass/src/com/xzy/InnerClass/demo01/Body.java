package com.xzy.InnerClass.demo01;

public class Body {

    public class Heart {
        public void beat(){
            System.out.println("心跳");
            System.out.println("我叫："+ name);
        }
    }

    private String name;

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
