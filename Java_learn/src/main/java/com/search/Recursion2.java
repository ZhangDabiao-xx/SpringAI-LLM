package com.search;

public class Recursion2 {
    public static void main(String[] args){
        //递归：求解5的阶乘
        int result = getFactorial(5);
        System.out.println(result);
    }

    public static int getFactorial(int number){
        if(number == 1){
            return 1;
        }

        return number * getFactorial(number-1);
    }
}
