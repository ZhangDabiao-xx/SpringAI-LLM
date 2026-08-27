package com.list.generics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    //类中定义一静态方法addAll,用来添加多个集合元素。

    //如果只有一个方法的参数类型不确定，可以在方法修饰符后面加E
    public static<E> void addAll(ArrayList<E> list, E...e){
        for(E e1 : e){
            list.add(e1);
        }
    }
}
