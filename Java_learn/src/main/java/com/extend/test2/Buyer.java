package com.extend.test2;

public class Buyer extends AdminStaff{

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"在采购材料");
    }
}
