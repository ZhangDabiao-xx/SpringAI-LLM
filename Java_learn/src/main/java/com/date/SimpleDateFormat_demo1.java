package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_demo1 {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat 对时间对象进行格式化，按照指定字符串格式进行输出

        //method1();

        //2.将字符串转为Date
        method2();
    }

    private static void method2() throws ParseException {
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }

    private static void method1() {
        //1.空参构造
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String format1 = sdf.format(d1);
        System.out.println(format1);

        //2.有参构造
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format2 = sdf2.format(d1);
        System.out.println(format2);

        //3.练习：以xxxx年xx月xx日 xx:xx:xx 星期x输出
        String format3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE").format(new Date());
        System.out.println(format3);
    }
}
