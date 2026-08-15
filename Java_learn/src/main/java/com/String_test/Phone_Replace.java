package com.String_test;

public class Phone_Replace {
    public static void main(String[] args){
        String phoneNumber = "18786221432";
        String number = phoneNumber.substring(3,7);//截取字符串部分
        String phoneNumber2 = phoneNumber.replace(number,"****");//替换指定字符串
        System.out.println(phoneNumber2);
    }
}
