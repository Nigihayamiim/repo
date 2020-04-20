package com.xzy.collection.iterator;

import java.util.*;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
 */
public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("布兰德");
        coll.add("姚明");
        coll.add("库里");
        coll.add(new Scanner(System.in).next());

        Iterator<String> iterator = coll.iterator();

        boolean b = iterator.hasNext();
        System.out.println(b);

        String s = iterator.next();
        System.out.println(s);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------");

        for (String a:coll
             ) {
            System.out.println(a);
        }
    }
}
