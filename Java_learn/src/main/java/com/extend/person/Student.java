package com.extend.person;

public class Student extends Person{

    public Student(){
        super();//子类无参构造是有一个super()方法将访问父类的无参构造，这个方法不写虚拟机也会自动添加
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age){
        super(name, age);//访问父类有参构造
    }

}
