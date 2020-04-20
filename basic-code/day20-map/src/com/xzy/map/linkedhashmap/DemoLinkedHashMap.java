package com.xzy.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer > linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("xixi",12);
        linkedHashMap.put("haha",13);
        linkedHashMap.put("heihei",11);
        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();

        for (Map.Entry<String, Integer> m : entries){
            String key = m.getKey();
            Integer value = m.getValue();
            System.out.println(key+"--"+value);
        }
        System.out.println("-----------------------");

        Set<String> set = linkedHashMap.keySet();

        for (String s : set){
            Integer integer = linkedHashMap.get(s);
            System.out.println(s+"-"+integer);
        }

    }

}
