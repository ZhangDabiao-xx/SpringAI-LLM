package com.search;

public class Recursion {
    public static void main(String[] args){
        //用递归的方法求解1-100的和

        int sum = getSum(100);
        System.out.println(sum);
    }

    private static int getSum(int number) {
        if(number == 1){
            return 1;
        }

        return number + getSum(number - 1);
    }
}
