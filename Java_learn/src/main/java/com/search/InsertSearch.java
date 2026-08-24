package com.search;

public class InsertSearch {
    public static void main(String[] args){
        //插入排序
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //找到无序数组的开始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                startIndex = i+1;
                break;
            }
        }

        for(int i = startIndex; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
