package com.extend.employee;

public class Manager extends Employee{
    private double bounds;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bounds) {
        super(id,name,salary);
        this.bounds = bounds;
    }

    /**
     * 获取
     * @return bounds
     */
    public double getBounds() {
        return bounds;
    }

    /**
     * 设置
     * @param bounds
     */
    public void setBounds(double bounds) {
        this.bounds = bounds;
    }

    @Override
    public void work(){
        System.out.println("经理在管理其他人");
    }

}
