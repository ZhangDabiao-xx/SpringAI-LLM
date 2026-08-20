package com.regex;

public class Regex_FenZu {
    public static void main(String[] args){
        /*
        * (内部)分组：\\组号 表示把第x组的内容在拿出来用一次
        * */
        //需求1：判断一个字符串的开始部分和结束部分是否一致？单个字符
        // 字符串满足 a1243a &ajfdlka& 4ldfj4 这种类型则返回true;
        String str = "(.).+\\1";
        System.out.println("a1243a".matches(str));
        System.out.println("&ajfdlka&".matches(str));
        System.out.println("4ldfj4".matches(str));
        System.out.println("a1243b".matches(str));

        //需求2：判断一个字符串的开始部分和结束部分是否一致？多个字符
        //字符满足 abclsjdflabc 123fjald123 !@#sldfj!@#
        String regex2 = "(.+).+\\1";
        System.out.println("abclsjdflabc".matches(regex2));
        System.out.println("123fjald123".matches(regex2));
        System.out.println("!@#sldfj!@#".matches(regex2));
        System.out.println("aabldjglaac".matches(regex2));

        //需求3：开始部分和结束部分内部字符也要保持一致
        //aaadjflaaa 111kad124111 &&&ldafj&&&
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaadjflaaa".matches(regex3));
        System.out.println("111kad124111".matches(regex3));
        System.out.println("&&&ldafj&&&".matches(regex3));
        System.out.println("abclsjdflabc".matches(regex3));
    }
}
