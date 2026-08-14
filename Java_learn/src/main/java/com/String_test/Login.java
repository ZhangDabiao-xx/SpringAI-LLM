package com.String_test;

import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        String name = "user";
        String password = "123456";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String userPassword = sc.next();

            if(userName.equals(name) && userPassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("密码或账号错误！！！");
                count++;
            }
            if(count < 3){
                System.out.println("还有"+(3-count)+"次机会");
            }else{
                System.out.println("账号被锁定！！！");
                break;
            }
        }
    }
}
