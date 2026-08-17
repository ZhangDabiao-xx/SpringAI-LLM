package com.comprehensive_exercises.student_system;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("==============欢迎来到学生管理系统===============");
            System.out.println("输入数字1添加学生信息");
            System.out.println("输入数字2删除学生信息");
            System.out.println("输入数字3修改学生信息");
            System.out.println("输入数字4查询学生信息");
            System.out.println("输入数字5退出系统");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字");
            String choose = sc.next();

            switch(choose){
                case "1" -> addStudent(students);
                case "2" -> removeStudent(students);
                case "3" -> setStudent(students);
                case "4" -> getStudent(students);
                case "5" -> {
                    System.out.println("退出系统");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    
    //添加学生信息
    public static void addStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        String id = null;

        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(students, id);
            if(flag){
                //id已经存在，请重新输入
                System.out.println("id已经存在，请重新输入");
            }else{
                student.setId(id);
                break;
            }
        }


        System.out.println("请输入学生的姓名");
        String name = sc.next();
        student.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的住址");
        String address = sc.next();
        student.setAddress(address);

        students.add(student);
        System.out.println("学生信息添加成功");
    }
    
    //删除学生信息
    public static void removeStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生id");
        String id = sc.next();
        int index = getIndex(students,id);
        if(index == -1){
            System.out.println("该id不存在");
        }else{
            students.remove(index);
        }
    }
    
    //修改学生信息
    public static void setStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的id");
        String id = sc.next();

        int index = getIndex(students,id);

        if(index == -1){
            System.out.println("id不存在");
            return;
        }

        Student student = students.get(index);
        System.out.println("请输入你要修改的学生姓名：");
        String name = sc.next();
        student.setName(name);

        System.out.println("请输入你要修改学生的年龄：");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("请输入你要修改学生的地址：");
        String address = sc.next();
        student.setAddress(address);

        System.out.println("修改成功");

    }
    
    //查询学生信息
    public static void getStudent(ArrayList<Student> students){
        if(students.isEmpty()){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge() + "\t"+stu.getAddress());
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if(id.equals(stu.getId())){
                return true;
            }
        }
        return false;
    }

    //返回需要删除的学生的索引
    public static int getIndex(ArrayList<Student> students, String id){
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            if(id.equals(stu.getId())){
                return i;
            }
        }
        return -1;
    }
}
