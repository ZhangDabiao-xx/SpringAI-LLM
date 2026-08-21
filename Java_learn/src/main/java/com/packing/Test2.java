package com.packing;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 需求：将字符串数字，转为整数类行数字
         * */
        String s = "3456";

        //判断字符串是否符合规则
        int result = parseInt(s);
        if(result == -1){
            System.out.println("输入的数据有误");
        }else{
            System.out.println(result);
        }
    }

    private static int parseInt(String s) {
       String regex = "[1-9]\\d{0,9}";
       if(!s.matches(regex)){
           return -1;
       }else{
           int sum = 0;
           for (int i = 0; i < s.length(); i++) {
               int c = s.charAt(i) - '0';
               sum = sum*10+c;
           }
           return sum;
       }
    }
}
