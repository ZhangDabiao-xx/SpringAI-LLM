package com.abstract_test;

public class Zombie extends Ghost{

    public Zombie() {
    }

    public Zombie(String name, int HP, int ATK, int DP) {
        super(name, HP, ATK, DP);
    }

    @Override
    public void attack() {
        System.out.println(getName()+"使用平A，对史蒂夫造成"+getATK()+"点近战伤害");
    }
}
