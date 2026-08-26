package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //1.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.forEach(System.out::println);
    }
}
