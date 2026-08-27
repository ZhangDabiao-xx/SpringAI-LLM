package com.list.generics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args){
        /*
        * 泛型通配符：
        * ?也表示不确定类型，它可以进行类型的限定
        * ? extends E: 表示可以传递E或者E所有的子类类型
        * ? super E: 表示可以传递E或者E所有的父类类型
        * */

        ArrayList<Ye> list1 = new ArrayList<Ye>();
        ArrayList<Fu> list2 = new ArrayList<Fu>();
        ArrayList<Zi> list3 = new ArrayList<Zi>();
        ArrayList<Student> list4 = new ArrayList<Student>();

        /*
        method(list1);
        method(list2);
        method(list3);
        method(list4);//报错，因为Student，不继承Ye
        */

        /*
        method2(list1);
        method2(list2);
        method2(list3);//Zi不是Fu的父类，所以报错
        method2(list4);//Student也不是父类，也会报错
        */

    }

    public static void method(ArrayList<? extends Ye> list){}

    public static void method2(ArrayList<? super Fu> list){}
}

class Ye{}

class Fu extends Ye{}

class Zi extends Fu{}

class Student{}
