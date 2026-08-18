package com.abstract_test;

public class KLP extends Ghost{

    public KLP() {
    }

    public KLP(String name, int HP, int ATK, int DP) {
        super(name, HP, ATK, DP);
    }

    @Override
    public void attack() {
        System.out.println(getName()+"爆炸，对史蒂夫造成"+getATK()+"点伤害");
    }
}
