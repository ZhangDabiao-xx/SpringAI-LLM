package com.extend.test2;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"在教学");
    }
}
