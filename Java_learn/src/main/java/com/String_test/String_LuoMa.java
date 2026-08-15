package com.String_test;

import java.util.Scanner;

public class String_LuoMa {
    /*
    * 需求：将数字转为罗马数字
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入字符串：");
            str = sc.next();

            //判读输入的字符串是否符合要求
            boolean flag = isLegal(str);
            if(flag){
                break;
            }else{
                System.out.println("输入的数据不合法，请重新输入：");
            }
        }

        //数字转换
        String result = changeLuoMa(str);
        System.out.println(result);

    }

    public static boolean isLegal(String str){
        //字符串长度必须小于9
        if(str.length() > 9){
            return false;
        }
        //字符必须为数字
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }

        return true;
    }

    public static String changeLuoMa(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i) - 48;
            //方法一：查表法
            //String luoMa = getLuoMa(number);
            //方法二
            String luoMa = getLuoMa2(str.charAt(i));
            sb.append(luoMa);
        }
        return sb.toString();
    }

    public static String getLuoMa(int number){
        String[] strs = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return strs[number];
    }

    public static String getLuoMa2(char ch){
        String str = switch(ch){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;
    }
}
