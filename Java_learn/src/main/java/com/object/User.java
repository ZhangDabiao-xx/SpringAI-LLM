package com.object;

import java.util.StringJoiner;

//一个空的接口表示一个标记，说明该对象能够被克隆
public class User implements Cloneable{
    private int id;
    private String name;
    private int[] data;


    public User() {
    }

    public User(int id, String name, int[] data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", data = " + arrToString() + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    private String arrToString(){
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }

}
