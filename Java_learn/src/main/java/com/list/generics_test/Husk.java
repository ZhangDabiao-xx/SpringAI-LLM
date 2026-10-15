package com.list.generics_test;

public class Husk extends Zombie{
    @Override
    public void attack() {
        System.out.println(getGrade()+"级的尸壳："+getName()+"伤害更高，而且不会受到太阳灼烧，一般出现在沙漠");
    }
}
