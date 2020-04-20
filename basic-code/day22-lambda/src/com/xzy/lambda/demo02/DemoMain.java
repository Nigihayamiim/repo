package com.xzy.lambda.demo02;


import java.util.Arrays;
import java.util.Comparator;

public class DemoMain {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("小明",12),
                new Person("小华",13),
                new Person("小芳",11)
        };

        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        /*Arrays.sort(arr,(Person o1, Person o2) -> {
            return o1.getAge()-o2.getAge();
        });*/

        Arrays.sort(arr,( o1,  o2) ->
            o1.getAge()-o2.getAge()
        );

        for (Person p : arr){
            System.out.println(p);
        }
    }
}
