package com.String_test;

public class String_Reverser {
    public static void main(String[] args){
        //1.字符串拼接
        int[] arr = {1,2,4};
        String s1 = arrToString(arr);
        System.out.println(s1);

        //2.字符串反转
        String s = "abc";
        String s2 = reverser(s);
        System.out.println(s2);
    }

    public static String arrToString(int[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                result += arr[i];
            }else{
                result += arr[i]+",";
            }
        }
        result = result + "]";
        return result;
    }

    public static String reverser(String s){
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
