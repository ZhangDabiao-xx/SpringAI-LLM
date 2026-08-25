package com.lambda.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("张飞",25,185);
        Student s2 = new Student("赵云",23,180);
        Student s3 = new Student("关羽",29,190);
        Student s4 = new Student("张辽",29,180);
        Student s5 = new Student("马超",25,185);

        Student[] list = {s1,s2,s3,s4,s5};

        Arrays.sort(list,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if(temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else{
                    return 0;
                }

            }
        });
        System.out.println(Arrays.toString(list));
    }
}
