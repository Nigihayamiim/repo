package com.xzyim.day06.demo01;

public class Student {

    public String name ;
    private int  age ;

    public Student(){
        System.out.println("构造方法执行了");
    }

    public void study(){
        System.out.println(age+"岁的"+name+"正在学习");
    }

    public void sleep(){
        System.out.println(age+"岁的"+name+"正在睡觉");
    }

    public void setAge(int age) {
        if (age<120 && age>0){
            this.age = age;
        }else {
            System.out.println("年龄有误！");
        }
    }

    public int getAge() {
        return age;
    }
}
