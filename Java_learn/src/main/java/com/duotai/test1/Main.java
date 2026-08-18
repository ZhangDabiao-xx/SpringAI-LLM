package com.duotai.test1;

public class Main {
    public static void main(String[] args){
        Person p = new Person("老王",78);
        Dog d = new Dog(3,"红");
        p.keepPet(d,"骨头");
        Cat c = new Cat(2,"黑");
        p.keepPet(c,"鱼");
    }
}
