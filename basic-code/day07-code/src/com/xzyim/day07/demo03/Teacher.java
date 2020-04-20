package com.xzyim.day07.demo03;

public class Teacher extends Person {

    int age;
    String name;

    public void teach() {
        System.out.println(name + "  " + age + "正在教学");
    }

}
