package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args){
        /*
        * 1.普通遍历 2.增强for 3.Lambda       这三种方式在遍历过程中不能删除或增加数据
        * 4.迭代器     在遍历过程中可以删除数据，但是不能添加，要使用迭代器方法
        * 5.列表迭代器       在遍历过程中可以删除和添加数据，但是要是用迭代器的方法*/
        //List的五种遍历方式
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //普通遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        //增强for
        for(String str:list){
            System.out.println(str);
        }

        //Lambda
        list.forEach(s -> System.out.println(s));

        //iterator迭代器
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //列表迭代器
        ListIterator<String> lt = list.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }
    }
}
