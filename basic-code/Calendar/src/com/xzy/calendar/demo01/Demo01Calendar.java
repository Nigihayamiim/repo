package com.xzy.calendar.demo01;

import java.util.Calendar;
import java.util.HashSet;

public class Demo01Calendar {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        System.out.println(y);
    }
}
