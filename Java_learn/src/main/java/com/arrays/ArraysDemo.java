package com.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        //Arrays相当于数组工具，没有构建方法，只有静态方法，通过类名调用
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //toString()将数组转为字符串
        System.out.println(Arrays.toString(arr));

        //binarySearch二分查找
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,20));

        //copy()拷贝数组
        int[] arrCopy = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arrCopy));

        //fill()填充数组
        Arrays.fill(arrCopy,0);
        System.out.println(Arrays.toString(arrCopy));

        //sort()排序，默认条件下，给基本数据类型进行升序排列。底层使用的是快速排列方法
        int[] arr2 = {10,2,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
