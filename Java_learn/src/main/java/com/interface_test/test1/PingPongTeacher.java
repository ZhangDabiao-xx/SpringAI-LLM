package com.interface_test.test1;

public class PingPongTeacher extends Teacher implements SpeakEnglish{
    public PingPongTeacher() {
    }

    public PingPongTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println(getName()+"说英语");
    }
}
