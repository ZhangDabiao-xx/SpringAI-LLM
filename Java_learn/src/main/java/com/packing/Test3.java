package com.packing;

public class Test3 {
    public static void main(String[] args){
        int number = 123;
        String result = toBinaryString(number);
        System.out.println(result);

    }

    public static String toBinaryString(int number){
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number==0){
                break;
            }
            int c = number %2;
            sb.append(c);
            number = number/2;
        }
        sb.reverse();
        return sb.toString();
    }
}
