package com.regex;

public class RegexDemo1 {
    public static void main(String[] args){
        //使用正则表达式判断QQ号
        /*
        * 需求：qq号的长度6-20位，不能以0开头，必须是数字
        * */

        String QQ = "2145863818";

        //常规操作
        System.out.println(isQQ(QQ));
        //正则表达式
        boolean flag = QQ.matches("[1-9]\\d{5,19}");
        System.out.println(flag);


    }

    public static boolean isQQ(String s){
        //通过不满足条件进行快速判断，举反例思想，逻辑性更强。
        int lenth = s.length();
        if(lenth < 6 || lenth > 20){
            return false;
        }

        if(s.startsWith("0")){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
        }

        return true;
    }
}
