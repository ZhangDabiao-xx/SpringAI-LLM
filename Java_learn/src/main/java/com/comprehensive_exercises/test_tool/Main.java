package com.comprehensive_exercises.test_tool;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        String s = ArrayUtil.printArr(arr);
        System.out.println(s);
        double avg = ArrayUtil.average(arr);
        System.out.println(avg);
    }
}
