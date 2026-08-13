package com.oo_test.object_array2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student[] sts = new Student[3];
        Student s1 = new Student("1234","zhangsan",23);
        Student s2 = new Student("1235","lisi",24);
        Student s3 = new Student("1236","wangwu",20);

        sts[0] = s1;
        sts[1] = s2;
        sts[2] = s3;

        Student s4 = new Student("1237","zhaosi",45);

        //1.添加学生
        add(sts,s4);
        System.out.println("=======================");

        //2.通过id删除学生信息
        String id = "1234";
        //deleted(sts,id);

        //3.查询学生对象
        ask(sts,id);
    }

    public static void add(Student[] sts, Student s){
        boolean exist = isExist(sts,s.getId());
        if(exist){
            System.out.println("该学生已经存在");
        }else{
            int count = 0;
            for(Student st: sts){
                if(st != null){
                    count++;
                }
            }
            if(count == sts.length){
                Student[] sts2 = new Student[sts.length+1];
                for (int i = 0; i < sts.length; i++) {
                    sts2[i] = sts[i];
                }
                sts2[sts.length] = s;
                printlnStudent(sts2);
            }else{
                sts[count] = s;
                printlnStudent(sts);
            }

        }
    }

    //判断学生是否存在
    public static boolean isExist(Student[] sts, String s){
        for (int i = 0; i < sts.length; i++) {
            if(sts[i] != null){
                if(sts[i].getId().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

    //打印数组
    public static void printlnStudent(Student[] sts){
        for(Student s: sts){
            System.out.println(s);
        }
    }

    //删除学生信息
    public static void deleted(Student[] sts, String id){
        for (int i = 0; i < sts.length; i++) {
            if(sts[i] != null){
                if(sts[i].getId().equals(id)){
                    sts[i] = null;
                    break;
                }
            }
        }
        printlnStudent(sts);
    }

    //查询学生
    public static void ask(Student[] sts, String id){
        for (int i = 0; i < sts.length; i++) {
            if(sts[i] != null){
                if(sts[i].getId().equals(id)){
                    sts[i].setAge(sts[i].getAge()+1);
                }
            }
        }
        printlnStudent(sts);
    }
}
