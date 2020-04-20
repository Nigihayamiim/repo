package com.xzyim.day05.Demo03;

import com.xzyim.day05.demo04.Demo01ArrayParam;

import java.util.Arrays;


public class Demo03Array {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};



        for (int i = 0; i < array.length; i++) {

            if (i< (array.length +1) / 2) {

                int temp ;
                temp = array[i];

                array[i] = array[array.length-1 - i];
                array[array.length-1 - i] = temp;
            }

            //System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

        /*for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }*/

        for (int min = 0,max = array.length-1 ;min <max ; min++ , max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        /*for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }*/

        Demo01ArrayParam.printArray(array);

    }





}
