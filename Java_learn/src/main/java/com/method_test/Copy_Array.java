package com.method_test;

public class Copy_Array {
    //定义一个方法copyOfRange(int[] arr, int from, int to)
    //将数组arr的from到to索引部分复制到新的数组中
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,8,7,34,46,34};
        int from = 2;
        int to = 6;
        int[] newArr;
        newArr = copyOfRange(arr,from,to);
        for(int num : newArr){
            System.out.print(num+",");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from + 1];
        for (int i = from; i <= to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
    }
}
