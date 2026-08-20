package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFomat_test {
    public static void main(String[] args) throws ParseException {
        /*
        * 练习1：将2020-11-11转为2020年11月11日
        * 练习2：秒杀活动2023年11月11日 0:0:0 -- 2023年11月11日 0:10:0;
        * 小明参与时间为2023年11月11日 0:01:00, 小华参加时间为2023年11月11日 0:11:00;
        * 判断它们是否满足要求；
        * */

        //练习1
        test1();

        //练习2
        String xiaoming = "2023年11月11日 0:11:00";
        test2(xiaoming);

    }

    private static void test2(String xiaoming) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf1.parse("2023年11月11日 0:0:0");
        Date endTDate = sdf1.parse("2023年11月11日 0:10:0");
        Date date = sdf1.parse(xiaoming);

        long startTime = startDate.getTime();
        long endTime = endTDate.getTime();
        long time = date.getTime();

        if(time > startTime && time < endTime){
            System.out.println("参加成功");
        }else{
            System.out.println("参加失败");
        }
    }

    private static void test1() throws ParseException {
        String str = "2020-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd");
        String format = sdf1.format(date);
        System.out.println(format);
    }
}
