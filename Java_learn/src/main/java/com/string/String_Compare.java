package com.string;

public class String_Compare {
    public static void main(String[] args){
        //1.创建两个字符串
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "ABC";

        //==比较
        System.out.println(s1==s2);

        //equals比较
        System.out.println(s1.equals(s2));

        //忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
