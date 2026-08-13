package com.oo_test.object_array;

public class Main {
    public static void main(String[] args){
        Product[] p = new Product[3];
        Product p1 = new Product("2037502","iphone",8888.8,20);
        Product p2 = new Product("3450726","redmi",4999.9,12);
        Product p3 = new Product("20374508","vivo",2666.6,13);
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        for(Product pr:p){
            System.out.println(pr.toString());
        }
    }
}
