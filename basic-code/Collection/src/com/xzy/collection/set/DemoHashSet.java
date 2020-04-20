package com.xzy.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 无序
 * 底层是哈希表结构：数组+链表/红黑树（查询速度非常快）
 */
public class DemoHashSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
