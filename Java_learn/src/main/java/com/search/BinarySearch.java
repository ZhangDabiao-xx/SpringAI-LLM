package com.search;

public class BinarySearch {
    public static void main(String[] args){
        //二分查找，适用于有序的数列
        int[] arr = {14,23,34,46,57,78,87,93,123,134,234,334};
        int number = 14;
        int i = binarySearch(arr, number);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr, int number){
        //定义两个变量表示查找范围
        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if(min > max){
                return -1;
            }
            //定义中间变量
            int mid = (min+max)/2;
            //比较mid索引数与查找的数
            if(arr[mid] > number){
                //需要查找的数在mid左边，min不变， max = mid - 1;
                max = mid -1;
            }else if(arr[mid] < number){
                //需要查找的数在mid的右边，max不变，min = mid + 1;
                min = mid + 1;
            }else{
                return mid;
            }
        }
    }
}
