package com.string;

public class String_Construction {
    public static void main(String[] args){
        //1.直接赋值
        String str1 = "abc";
        System.out.println(str1);

        //2.空参构造
        String str2 = new String();
        System.out.println(str2);

        //3.有参构造
        String str3 = new String("abc");
        System.out.println(str3);

        //4.根据字符数组创建字符串对象
        char[] chrs = {'a','b','c'};
        String str4 = new String(chrs);
        System.out.println(str4);

        //5.通过字符数组一部分创建字符串
        String str5 = new String(chrs,0,1);//左闭右开，只包含索引0
        System.out.println(str5);//打印a

        //6.通过字节数组创建字符串
        byte[] bys = {97,98,99};
        String str6 = new String(bys);
        System.out.println(str6);
    }
}
