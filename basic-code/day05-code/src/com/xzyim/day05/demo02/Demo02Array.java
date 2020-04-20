package com.xzyim.day05.demo02;

public class Demo02Array {

    public static void main(String[] args) {

        int[] array = {5, 25, 46, 3, 78, 15, 6, 9};
        int max = 0;
        int num = 0 ;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                num = i +1 ;
            }
        }
        System.out.println("最大值是：" + max + "是第几个：" + num);
        System.out.println(max + num);
    }


}
