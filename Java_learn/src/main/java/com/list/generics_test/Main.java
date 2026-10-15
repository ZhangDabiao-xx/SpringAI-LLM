package com.list.generics_test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CommonZombie> list1 = new ArrayList<>();
        ArrayList<Husk> list2 = new ArrayList<>();
        ArrayList<CommonSkeleton> list3 = new ArrayList<>();
        ArrayList<Stray> list4 = new ArrayList<>();
        Husk husk = new Husk();
        husk.setName("小黑");
        husk.setGrade(20);
        list2.add(husk);

        action(list1);
        action(list2);
        action(list3);
        action(list4);

        action2(list1);
        action2(list2);
        //action2(list3);报错，action2()只能是Zombie或者它的子类才可以
        //action2(list4);报错
    }

    public static void action(ArrayList<? extends Undead> E){
        for(Undead undead : E){
            undead.attack();
        }
    }

    public static void action2(ArrayList<? extends Zombie> E){
    }
}
