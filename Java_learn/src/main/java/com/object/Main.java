package com.object;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        int[] data = {1,2,3,4,5,6,7};
        user.setData(data);
        //User cloneUser = (User) user.clone();


        //System.out.println(cloneUser);

        Gson gson = new Gson();
        String s = gson.toJson(user);
        User user1 = gson.fromJson(s, User.class);

        int[] arr =  user.getData();
        arr[0] = 100;
        System.out.println(user);
        System.out.println(user1);
    }
}
