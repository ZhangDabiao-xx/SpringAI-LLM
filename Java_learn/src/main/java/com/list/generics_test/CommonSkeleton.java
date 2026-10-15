package com.list.generics_test;

public class CommonSkeleton extends Skeleton {
    @Override
    public void attack() {
        System.out.println(getGrade()+"级的普通骷髅"+getName()+"能够使用弓箭进行远程攻击，最好使用盾进行抵挡");
    }
}
