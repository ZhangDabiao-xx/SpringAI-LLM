package com.search;

public class Bubble {
    public static void main(String[] args){

        int[] arr = {2,4,5,1,3};

        //冒泡排序
        getBubble(arr);

        System.out.println("====================");

        //选择排序
        getChose(arr);
    }

    private static void getChose(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[0] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[0];
                    arr[0] = temp;
                }
            }
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    private static void getBubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
