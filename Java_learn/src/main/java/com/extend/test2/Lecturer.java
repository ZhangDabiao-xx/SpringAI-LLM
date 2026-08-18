package com.extend.test2;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"在讲课");
    }
}
