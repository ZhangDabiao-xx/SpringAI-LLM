package com.packing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        String birthday = "2001年12月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(birthday);
        long birthTime = birthDate.getTime();
        long time = System.currentTimeMillis() - birthTime;
        System.out.println(time/1000/60/60/24);
    }
}
