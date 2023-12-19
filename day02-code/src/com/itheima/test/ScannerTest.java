package com.itheima.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = input.next();
        System.out.println("请输入您的年龄:");
        int age = input.nextInt();
        System.out.println("请输入您的性别:");
        String sex = input.next();
        System.out.println("请输入您的身高:");
        int height = input.nextInt();
        System.out.println("请输入您的婚姻状况:");
        boolean isMale = input.nextBoolean();
        System.out.println("注册成功");
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(height);
        System.out.println(isMale);
    }
}
