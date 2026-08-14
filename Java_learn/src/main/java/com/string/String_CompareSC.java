package com.string;

import java.util.Scanner;

public class String_CompareSC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();//键盘录入也是new出来的
        String str2 = "abc";
        System.out.println(str1==str2);//false
    }
}
