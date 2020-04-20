package com.xzyim.day07.demo03;

public class Student extends Person {

    int age;
    String name;

    public void study() {
        System.out.println(name + "  " + age + "正在学习");
    }

    public Student() {
        System.out.println("2");
    }

}
