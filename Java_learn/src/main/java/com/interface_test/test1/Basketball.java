package com.interface_test.test1;

public class Basketball extends Sportsman{
    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName()+"学打篮球");
    }
}
