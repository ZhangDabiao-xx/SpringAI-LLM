package com.date;

import java.util.Date;
import java.util.Random;

public class Date_demo2 {
    public static void main(String[] args) {
        /*
         * 需求1：打印时间原点开始一年之后的时间
         * 需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
         * */

        //需求1
        //yearTime();

        //需求2
        compareTime();

    }

    private static void compareTime() {
        Random r = new Random();
        Date data1 = new Date(Math.abs(r.nextInt()));
        Date data2 = new Date(Math.abs(r.nextInt()));

        long time1 = data1.getTime();
        long time2 = data2.getTime();

        if(time1 > time2){
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else if(time1 < time2){
            System.out.println("第一个时间在前面，第二个时间在后面");
        }else{
            System.out.println("两个时间一样");
        }
    }

    private static void yearTime() {
        Date date = new Date(0L);
        long time = date.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        date.setTime(time);
        System.out.println(date);
    }
}
