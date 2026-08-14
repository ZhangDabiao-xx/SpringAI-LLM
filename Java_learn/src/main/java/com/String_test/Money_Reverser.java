package com.String_test;

import java.util.Scanner;

public class Money_Reverser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额：");
        int money;
        while(true){
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else{
                System.out.println("输入的金额无效，请重新输入：");
            }
        }

        //得到money中的每个数字
        String result = "";
        while(money > 0){
            int ge = money%10;
            String bigGe = reverser(ge);
            result = bigGe + result;
            money = money/10;
        }

        //补零
        int count = 7- result.length();
        for (int i = 0; i < count; i++) {
            result = "零"+result;
        }

        //插入单位
        String moneyStr = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < result.length(); i++) {
            moneyStr = moneyStr+result.charAt(i)+arr[i];
        }
        System.out.println(moneyStr);
    }

    public static String reverser(int ge){
        String[] s = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return s[ge];
    }
}
