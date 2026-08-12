package com.method_test;

public class Solution_Value {
    //求解数组最大值
    public static void main(String[] args){
        int[] arr = {11,442,35,23};
        getValue(arr);
    }

    public static void getValue(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
