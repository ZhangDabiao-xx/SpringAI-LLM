package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args){
        //sort(数组，排序规则)，可以自定义排序方法，其原理用到了插入排序和二分查找
        //只能给引用数据类型进行排序，如果是基本数据类型需要变成对应的包装类。
        Integer[] arr2 = {10,2,3,5,6,1,7,8,4,9};
        //采用匿名内部类的方式
        Arrays.sort(arr2,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1+","+o2);
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr2));


    }
}
