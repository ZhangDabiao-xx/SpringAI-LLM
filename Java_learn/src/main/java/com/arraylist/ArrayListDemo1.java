package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args){
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //增：添加元素并返回boolean值
        list.add("aaa");
        list.add("bbb");
        boolean flag = list.add("ccc");
        System.out.println(flag);

        //删：移除元素
        //1.移除指定元素
        list.remove("ccc");
        System.out.println(list);
        //2.按索引移除指定元素并返回值
        String remove = list.remove(1);
        System.out.println(remove);

        //改：更改元素
        String set = list.set(0, "eee");
        System.out.println(set);

        //查：查询元素
        String s = list.get(0);
        System.out.println(s);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
