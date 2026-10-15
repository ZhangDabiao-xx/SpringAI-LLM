package com.list.generics_test;

public class Drowned extends Zombie{
    @Override
    public void attack() {
        System.out.println(getGrade()+"级的溺尸："+getName()+"由普通僵尸在水中转变而来，能使用三叉戟进行攻击，伤害很高");
    }
}
