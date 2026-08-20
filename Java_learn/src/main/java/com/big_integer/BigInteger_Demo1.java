package com.big_integer;

import java.math.BigInteger;
import java.util.Random;

public class BigInteger_Demo1 {
    public static void main(String[] args){
        Random r = new Random();
        BigInteger bi = new BigInteger(10,r);
        System.out.println(bi);

        BigInteger bi2 = new BigInteger("100");//以十进制转换
        System.out.println(bi2);

        BigInteger bi3 = new BigInteger("11",2);//以二进制转换
        System.out.println(bi3);

        BigInteger bi4 = BigInteger.valueOf(1000);
        System.out.println(bi4);

        BigInteger bi5 = BigInteger.valueOf(100);
        BigInteger bi6 = bi5.max(bi4);
        System.out.println(bi4.equals(bi6));
        System.out.println(bi5.equals(bi6));
        System.out.println(bi6);
    }
}
