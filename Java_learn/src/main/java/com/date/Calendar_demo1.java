package com.date;

import java.util.Calendar;
import java.util.Date;

public class Calendar_demo1 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal);

        Date d = new Date(0L);
        cal.setTime(d);
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"-"+month+"-"+day+"-"+week);
    }
}
