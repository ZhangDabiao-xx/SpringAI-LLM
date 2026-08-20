package com.regex;

public class Regex_FenZuOut {
    public static void main(String[] args){
        //分组 $x 表示外部使用分组
        String s = "我要学学编编编编程程程程程程";
        String regex = "(.)\\1+";
        String result = s.replaceAll(regex, "$1");
        System.out.println(result);
    }
}
