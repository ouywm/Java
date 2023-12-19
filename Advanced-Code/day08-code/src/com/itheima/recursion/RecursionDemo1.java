package com.itheima.recursion;

public class RecursionDemo1 {
    /*
            递归的介绍： 方法直接或间接调用本身
     */
    public static void main(String[] args) {
        methodA();

    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        methodA();
    }
}
