package com.xzy.collection.varargs;

/*
    可变参数：JDK1.5之后的新特性
    使用前提：当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
    使用格式: 定义方法时使用
       修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,他会创建不同长度的数组来存储这些参数
        传递参数个数可以是0个(不传递),1,2...多个
 */
public class DemoVarArgs {

    public static void main(String[] args) {
        int result = add(1,5,6,7,6);
        System.out.println(result);
    }

    public static int add(int...arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }

}
