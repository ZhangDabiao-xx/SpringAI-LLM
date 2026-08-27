package com.list.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        ListUtil.addAll(list3,1,3,4,5,6,76,8);
        System.out.println(list3);
    }
}
