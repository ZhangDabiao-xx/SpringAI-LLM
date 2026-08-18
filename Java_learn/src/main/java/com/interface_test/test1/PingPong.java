package com.interface_test.test1;

public class PingPong extends Sportsman implements SpeakEnglish{

    public PingPong() {
    }

    public PingPong(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName()+"学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println(getName()+"说英语");
    }
}
