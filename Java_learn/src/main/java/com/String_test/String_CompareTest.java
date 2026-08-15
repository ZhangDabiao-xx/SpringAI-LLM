package com.String_test;

public class String_CompareTest {
    //判断字符串a是否能通过旋转得到字符串b
    public static void main(String[] args){
        String a = "abcde";
        String b = "deabc";

        //旋转字符串
        boolean check = check(a, b);
        System.out.println(check);
    }

    public static boolean check(String a,String b){
        for (int i = 0; i < a.length(); i++) {
            a = rotate2(a);
            if(a.equals(b)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String s){
        char first = s.charAt(0);
        String end = s.substring(1);
        return end + first;
    }

    public static String rotate2(String s){
        char[] chs = s.toCharArray();
        char first = chs[0];
        for (int i = 0; i < chs.length-1; i++) {
            chs[i] = chs[i+1];
        }
        chs[chs.length-1] = first;

        return new String(chs);
    }
}
