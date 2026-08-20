package com.date;

import java.util.Date;

public class Date_demo1 {
    public static void main(String[] args){
        //1.创建时间对象
        Date d1 = new Date();
        System.out.println(d1);

        //2.有参构造
        Date d2 = new Date(0L);
        System.out.println(d2);

        //修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);
    }
}
