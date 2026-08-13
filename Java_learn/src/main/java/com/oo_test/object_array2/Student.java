package com.oo_test.object_array2;

public class Student {
    private String id;
    private String name;
    private int age;

    public Student(){}

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student [id="+id+",name="+name+",age="+age+"]";
    }
}
