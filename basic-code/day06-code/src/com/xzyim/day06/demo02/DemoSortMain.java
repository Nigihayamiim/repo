package com.xzyim.day06.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoSortMain {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student ("小明",12));
        list.add(new Student ("大明",15));
        list.add(new Student ("小明",13));
        list.add(new Student ("二明",17));
        list.add(new Student ("岁明",10));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getName().charAt(0) - o2.getName().charAt(0);
                if (result == 0){
                    result = o1.getAge() - o2.getAge();
                }
                return result;
            }
        });

        //Collections.sort(list);

        for (Student s : list){
            System.out.println(s);
        }
    }

}
