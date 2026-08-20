package com.regex;

public class Regex_Test6 {
    public static void main(String[] args) {
        /*
        有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
        要求1:把字符串中三个姓名之间的字母替换为vs
        要求2:把字符串中的三个姓名切割出来
        */
        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String regex = "[\\w&&[^_]]+";
        String result = s.replaceAll(regex,"vs");
        System.out.println(result);

        String[] sts = s.split(regex);
        for(String st:sts){
            System.out.println(st);
        }

    }
}
