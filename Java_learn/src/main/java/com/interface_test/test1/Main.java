package com.interface_test.test1;

public class Main {
    public static void main(String[] args){
        Basketball BS = new Basketball("詹姆斯",42);
        BS.learn();

        BasketballTeacher BT = new BasketballTeacher("波波维奇",65);
        BT.teach();

        PingPong PPM = new PingPong("马龙",32);
        PPM.learn();
        PPM.speak();

        PingPongTeacher PPT = new PingPongTeacher("王皓",37);
        PPT.speak();
        PPT.teach();
    }
}
