package com.abstractdemo;

public class Student extends Preson{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("工作");
    }
}
