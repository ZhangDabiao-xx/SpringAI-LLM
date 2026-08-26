package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args){
        //Collection是一个接口，无法创建对象，只能使用多肽
        Collection<String> list = new ArrayList<>();
        //1.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        //2.clear()清空
        //list.clear();
        //System.out.println(list);

        //3.remove(E e)删除指定元素
        boolean remove = list.remove("aaa");
        System.out.println(remove);
        System.out.println(list);

        //4.contains(Object obj)判断是否包含，注意：自定义类想要使用这个方法必须重写equals()方法
        boolean b1 = list.contains("aaa");
        System.out.println(b1);
        boolean b2 = list.contains("bbb");
        System.out.println(b2);

        //5.isEmpty()判断是否为空
        System.out.println(list.isEmpty());

        //size()集合长度
        System.out.println(list.size());
    }
}
