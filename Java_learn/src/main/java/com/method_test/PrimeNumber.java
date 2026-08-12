package com.method_test;

public class PrimeNumber {
    //判断101~200之间有多少个素数，并输出说有素数
    public static void main(String[] args){
        int count = 0;

        for(int i = 101; i <= 200; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
                System.out.print(i+",");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
