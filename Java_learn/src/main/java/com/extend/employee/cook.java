package com.extend.employee;

public class cook extends Employee {

    public cook() {}

    public cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("厨师在炒菜");
    }
}
