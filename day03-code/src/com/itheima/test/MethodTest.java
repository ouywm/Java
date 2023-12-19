package com.itheima.test;

public class MethodTest {
    public static void main(String[] args) {

        System.out.println("开始");
        int result = geMax(10,30);
        System.out.println("结束");
        System.out.println(result);
    }
    /*
        需求:定义一个方法,方法中定义出两个整数变量,求出最大值打印在控制台
     */
    public static int geMax(int num1, int num2) {
//        int num1 = 10;
//        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
        return max;
    }
}
