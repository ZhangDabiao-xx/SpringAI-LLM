package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args){
        //List是Collection的子类，但是List存在索引，可以通过索引实现增删改查的功能
        //List也是接口，需要用下面的实现类来实现，不能直接创建List对象
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add(1,"bbb");
        //该索引原来的元素会被放到下一位
        list.add(1,"ccc");

        //删除
        String remove = list.remove(0);
        System.out.println(remove);

        //查询
        String s = list.get(0);
        System.out.println(s);

        //修改
        list.set(0, "ddd");
        System.out.println(list);

    }
}
