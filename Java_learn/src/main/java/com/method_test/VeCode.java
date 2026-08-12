package com.method_test;

import java.util.Random;

public class VeCode {
    /*
     * 需求：
     *       定义方法产设随机验证码
     *       长度为5；
     *       前四位为大写或小写字母
     *       左后一位为数字
     * */
    public static void main(String[] args) {
        getVeCode();
    }

    public static void getVeCode() {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (i + 97);
            } else {
                chs[i] = (char) (i + 65 - 26);
            }
        }
        Random r = new Random();
        String VeCode = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chs.length);
            char ch = chs[index];
            VeCode += ch;
        }

        int number = r.nextInt(10);
        VeCode += number;
        System.out.println(VeCode);
    }
}
