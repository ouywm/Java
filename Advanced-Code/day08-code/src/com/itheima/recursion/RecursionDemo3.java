package com.itheima.recursion;

public class RecursionDemo3 {
    /*
            不死神兔
     */
    public static void main(String[] args) {
        int result = get(20);
        System.out.println(result);
    }


    public static int get(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return get(num - 2) + get(num - 1);
        }
    }
}