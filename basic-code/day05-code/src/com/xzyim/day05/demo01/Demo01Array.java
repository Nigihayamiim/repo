package com.xzyim.day05.demo01;

public class Demo01Array {
    public static void main(String[] args) {

        int[] array = {3,5,8,6,1};

        int[] arrayA = {3,5,8,6,8,6};

        array[1] = 2;

        System.out.println(array);
        System.out.println(arrayA);

        array = arrayA;

        arrayA[3] = 5;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println(array);
        //System.out.println(arrayA);
    }


}
