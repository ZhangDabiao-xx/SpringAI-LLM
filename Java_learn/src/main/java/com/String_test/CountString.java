package com.String_test;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                smallCount++;
            }else if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }else if(ch >= '0' && ch <='9'){
                numberCount++;
            }
        }
        System.out.println("bigCount = "+bigCount+"\nsmallCount = "+smallCount+"\nnumberCount = "+numberCount);
    }
}
