package com.regex;

import java.util.Scanner;

public class Regex_Test1 {
    public static void main(String[] args){
        //测试一：判断号码是否合规18786221432、13634562345、19123137834
        /*Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String regex = "1[3-9]\\d{9}";
        System.out.println(number.matches(regex));*/

        //测试二：测试座机号码是否正确
        //020-2324242 02122442 027-42424 0712-3242434

        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("0712-3242434".matches(regex2));

        //测试三：测试邮箱号码是否正确
        //3232323@qq.com zhangsan@itcast.cnn dlei009@163.com dlei0009@pci.com.cn
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
    }
}
