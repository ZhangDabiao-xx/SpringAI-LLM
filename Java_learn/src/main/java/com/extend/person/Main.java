package com.extend.person;

public class Main {
    public static void main(String[] args){
        Student st = new Student();
        Student st2 = new Student("zhangsan",24);
        System.out.println(st2.name+","+st2.age);
    }
}
