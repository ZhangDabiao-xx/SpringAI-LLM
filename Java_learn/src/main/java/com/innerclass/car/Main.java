package com.innerclass.car;

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        c.carAge = 1;
        c.carColor = "Red";
        c.carName = "宾利";
        c.show();

        Car.Engine e = new Car().new Engine();
        e.engineAge = 1;
        e.engineName = "猛禽";
        e.show();
    }
}
