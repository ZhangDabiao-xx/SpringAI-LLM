package com.search;

public class quickSort {
    public static void main(String[] args){
        //快速排序
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        int start = 0;
        int end = arr.length-1;
        getIndex(arr,start,end);
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +",");
        }

    }

    public static void getIndex(int[] arr ,int start, int end){
        int startIndex = start;
        int endIndex = end;

        //程序结束条件
        if(startIndex>endIndex){
            return;
        }

        int baseNum = arr[start];

        while(startIndex != endIndex){

            //注意必须先移动endIndex
            //endIndex从后往前移
            while(true){
                if(endIndex <= startIndex || arr[endIndex] < baseNum){
                    break;
                }
                endIndex--;
            }

            //startIndex从前往后移
            while(true){
                if(startIndex >= endIndex || arr[startIndex] > baseNum){
                    break;
                }
                startIndex++;
            }

            //将符合要求的startIndex和endIndex所指元素进行交换
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[start];
        arr[start] = temp;

        //利用递归重复
        getIndex(arr,start,startIndex-1);
        getIndex(arr,startIndex+1,end);
    }
}
