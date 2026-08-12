package com.method_test;

public class forEach_Array {
    //练习遍历数组
    public static void main(String[] args){
        int[] arr = {11,22,33,44};
        printArr(arr);
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
