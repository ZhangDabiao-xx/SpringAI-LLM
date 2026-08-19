package com.innerclass.car;

//外部类
public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        //外部类想要访问内部类成员需要先创建内部类对象
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    //内部类
    class Engine{
        String engineName;
        int engineAge;

        //内部类可以直接访问外部类成员
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
