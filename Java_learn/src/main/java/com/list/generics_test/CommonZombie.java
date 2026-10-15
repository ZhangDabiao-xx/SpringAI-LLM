package com.list.generics_test;

public class CommonZombie extends Zombie{
    @Override
    public void attack() {
        System.out.println(getGrade()+"级的普通僵尸:"+getName()+",通过拳头或者武器进行攻击，能够拾取玩家掉落的装备，会受到太阳的灼烧伤害，在水里会变成Drowned");
    }
}
