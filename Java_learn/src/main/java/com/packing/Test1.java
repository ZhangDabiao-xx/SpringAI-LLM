package com.packing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while(true){
            String strNum = sc.nextLine();
            int num = Integer.parseInt(strNum);
            if(num < 1 || num > 100){
                System.out.println("当前数字不在1~100的范围，请重新输入：");
                continue;
            }

            list.add(num);

            int sum = getSum(list);
            if(sum > 200){
                System.out.println("集合的所有数据和已经满足要求");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
