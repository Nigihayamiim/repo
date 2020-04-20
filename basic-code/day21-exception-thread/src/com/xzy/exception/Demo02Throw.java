package com.xzy.exception;

import java.util.Objects;

public class Demo02Throw {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr,3);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index){

        Objects.requireNonNull(arr,"传入的数组是null");

        /*if (arr == null){
            throw new NullPointerException("传入的数组是null");
        }*/
        if (index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传入的索引超出了数组范围");
        }
        int ele = arr[index];
        return ele;
    }

}
