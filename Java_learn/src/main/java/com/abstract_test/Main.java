package com.abstract_test;

public class Main {
    public static void main(String[] args){
        Zombie z = new Zombie("普通僵尸",30,10,25);
        z.attack();
        z.sum();

        HS h = new HS("骷髅射手",20,15,20);
        h.attack();
        h.sum();

        KLP K =  new KLP("苦力怕",15,30,10);
        K.attack();
    }
}
