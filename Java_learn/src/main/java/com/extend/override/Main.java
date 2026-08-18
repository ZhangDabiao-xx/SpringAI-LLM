package com.extend.override;

public class Main {
    public static void main(String[] args){
        Hashiqi hashiqi = new Hashiqi();
        hashiqi.eat();
        hashiqi.drink();
        hashiqi.lookHome();
        hashiqi.chaijia();

        shapigou spg = new shapigou();
        spg.eat();
        spg.drink();
        spg.lookHome();

        Tugou tg = new Tugou();
        tg.eat();
        tg.drink();
        tg.lookHome();
    }
}
