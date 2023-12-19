package com.itheima.test;

public class RandomNumber {
    public static void main(String[] args) {
        double number = (double) (Math.random());
        System.out.println(number);
        int count =0;
        int max = 0;
        do {
            number = max;
            count++;
        }
        while (number >= 0.999);
        System.out.println(max);
    }
}
