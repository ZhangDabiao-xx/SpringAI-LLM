package com.list.generics;

/* 测试泛型接口 */
public class Main2 {
    public static void main(String[] args) {
        //MyArrayList2已经规定了泛型为String所以必须添加String类型。
        MyArrayList2 list = new MyArrayList2();
        list.add("zhangsan");
        list.add("abc");

        //MyArrayList3没有规定泛型，所以创建时要指定泛型。
        MyArrayList3<Integer> list2 = new MyArrayList3<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
    }
}
