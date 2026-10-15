package com.list.generics_test;

public abstract class Undead {
    private String name;
    private int grade;


    public Undead() {
    }

    public Undead(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 设置
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public abstract void attack();

    public String toString() {
        return "Undead{name = " + name + ", grade = " + grade + "}";
    }


}
