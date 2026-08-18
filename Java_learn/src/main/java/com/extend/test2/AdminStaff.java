package com.extend.test2;

public class AdminStaff extends Employee{

    public AdminStaff() {
    }

    public AdminStaff(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"在行政工作");
    }
}
