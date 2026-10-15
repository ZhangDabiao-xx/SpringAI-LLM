package com.list.generics_test;

public class Stray extends Skeleton{
    @Override
    public void attack() {
        System.out.println(getGrade()+"级的流浪者"+getName()+"使用弓箭远程弓箭，而弓箭自带减速效果");
    }
}
