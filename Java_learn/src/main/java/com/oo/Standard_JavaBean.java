package com.oo;

public class Standard_JavaBean {
    public static void main(String[] args){
        User user = new User();//user相当于一个地址值指向堆内存中new出来的地址
        User user2 = user;//将user地址给了user2,此时它们的地址值相同，改动一个的参数，两个都改变，因为是一个地址。
        user.setName("ZhangDabiao");
        user.setPassword("123456");
        user.setEmail("235526245@qq.com");
        user.setGender("男");
        user.setAge(18);

        System.out.println(user.getName());
        System.out.println(user);//com.oo.User@2f4d3709
        System.out.println(user2);
        user2.setName("zhangsan");
        System.out.println(user.getName());//zhangsan
        user2 = null;//此时user2成为了空指针
        //System.out.println(user2.getName());//报错：空指针异常NullPointerException
    }
}
