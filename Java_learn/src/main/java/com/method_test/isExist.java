package com.method_test;

import java.util.Scanner;

public class isExist {
    //判断一个数是否在一个数组中存在
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();

        boolean exist = exist(arr,num);
        System.out.println(exist);
    }

    public static boolean exist(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
