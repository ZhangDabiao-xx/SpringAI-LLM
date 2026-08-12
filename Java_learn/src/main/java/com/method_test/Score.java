package com.method_test;

public class Score {
    /*
    * 定义一个方法获取选手的得分
    * 规则
    *   六个评委打分
    *   去掉最低分和最高分，获取平均值
    * */
    public static void main(String[] args){
        int[] arr = {78,85,86,89,94,90};
        double score = getSocre(arr);
        System.out.println(score);
    }

    public static double getSocre(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        return ((sum - min - max)/4.0);
    }
}
