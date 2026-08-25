package com.lambda;

public class Rabbit {
    public static void main(String[] args){
        //不死兔子，有一对兔子到第三个月开始(包括第三月)就会生一对兔子，新的兔子在第三个月也会生一对兔子
        //问12月会有多少只兔子

        int[] arr = new int[12];
        solution1(arr);
        int i = solution2(12);
        System.out.println(i);
    }

    private static void solution1(int[] arr) {
        //手动给0和1索引赋值
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[11]);
    }

    public static int solution2(int month){
        if(month == 1 || month == 2){
            return 1;
        }else{
            return solution2(month-1) + solution2(month-2);
        }
    }
}
