package com.extend.test2;

public class Main {
    public static void main(String[] args){
        Lecturer le = new Lecturer("heima001","张三");
        le.work();
        le.print();

        Buyer bu = new Buyer();
        bu.setId("heima002");
        bu.setName("李氏");
        bu.work();
        bu.print();
    }
}
