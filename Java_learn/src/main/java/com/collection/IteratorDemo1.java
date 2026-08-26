package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args){
        /*
        iterator迭代器相当于创建一个指向集合开始处的一个指针，
        hasNext()判断iterator所指位置是否有元素
        next()返回iterator所指元素，并将iterator向后移动
        迭代器遍历时，不能用集合的方法进行增加或者删除
        */
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        /*while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/
        String s = it.next();
        System.out.println(s);
        String s2 = it.next();
        System.out.println(s2);
    }
}
