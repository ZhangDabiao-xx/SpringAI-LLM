package com.lambda.test1;

public class Monkey {
    public static void main(String[] args) {
        //猴子吃桃，猴子每天吃一半加一个桃子，第十天的时候剩了一个桃子，问总共有多是桃
        System.out.println(getCount(1));
    }

    public static int getCount(int day) {
        if (day <= 0 || day > 10) {
            return -1;
        }

        if (day == 10) {
            return 1;
        }

        return (getCount(day + 1) + 1) * 2;
    }
}
