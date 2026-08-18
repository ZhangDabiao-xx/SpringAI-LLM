package com.extend.test2;

public class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"在辅助学习");
    }
}
