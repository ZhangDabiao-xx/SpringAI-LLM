package com.extend.cat_and_dog;

public class Main {
    public static void main(String[] args){
        LiHua lh = new LiHua();
        lh.eat();
        lh.drink();
        lh.action();

        System.out.println("====================");

        Hashiqi dog = new Hashiqi();
        dog.eat();
        dog.drink();
        dog.action();
        dog.look();
    }
}
