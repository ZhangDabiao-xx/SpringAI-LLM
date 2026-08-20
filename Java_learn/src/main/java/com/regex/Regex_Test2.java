package com.regex;

public class Regex_Test2 {
    public static void main(String[] args) {
        /*
        * 1.验证用户名是否正确：大小写字母，数字，下划线，4-16位
        * 2.验证身份证号码，简单版本：前17位为任意数字，后一个可以是数字也可以是大写或小写的x;
        * 复杂版本：严格根据身份证要求
        * */

        //1.
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan123_alfj".matches(regex1));

        //2.
        String regex2 = "[1-9]\\d{16}[0-9xX]";
        System.out.println("52523412341224114X".matches(regex2));


    }
}
