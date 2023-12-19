package com.itheima.variable;

public class VairableDemo2 {
    /*
        变量的注意事项:

        1.变量名不允许重复定义

        2.一条语句可以定义多个变量,中间需要使用逗号分隔

        3.变量在使用之前,必须完成赋值

        4.TODO:变量的作用域
    */
    public static void main(String[] args) {
        byte w = 1;
        int salary=12000;
//        1.变量名不允许重复定义
//        int salary=15000;
        System.out.println(salary);

//        2.一条语句可以定义多个变量,中间需要使用逗号分隔
        int a = 10, b = 20, c = 30;
//        3.变量在使用之前,必须完成赋值
            int num;
            num = 10;
        System.out.println(num);

    }
}
