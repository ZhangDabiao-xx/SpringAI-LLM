package com.lambda;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args){
        //lambda练习，labda格式 (方法形参) -> {方法体}
        //只有函数式接口才能使用lambda表达式
        //函数式接口：有且仅有一个抽象方法的接口
        String[] arr = {"a","aaaa","aa","aaa"};

        Arrays.sort(arr,(o1,o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
