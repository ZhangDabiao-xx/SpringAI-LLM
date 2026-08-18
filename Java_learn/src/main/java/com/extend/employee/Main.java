package com.extend.employee;

public class Main {
    public static void main(String[] args){
        Manager m = new Manager("heima001","张三",15000,3643);
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBounds());
        m.work();
        m.eat();

        cook c = new cook();
        c.setId("heima002");
        c.setName("李氏");
        c.setSalary(12000);
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        c.work();
        c.eat();
    }
}
