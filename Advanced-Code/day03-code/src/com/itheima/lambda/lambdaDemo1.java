package com.itheima.lambda;

public class lambdaDemo1 {
    /*
            lambda表达式 ： JDK8开始后的一种新语法形式

            作用 ： 简化匿名内部类的代码写法

            格式： （） -> {}

                        () : 匿名内部类被重新方法的形参列表

                        {} ： 被重写方法的方法体代码

     */

    public static void main(String[] args) {

        userInter(new InterA() {

            @Override
            public void show() {
                System.out.println("匿名内部类，重写后的show方法");
            }
        });
        System.out.println("---------------------------------");
        // lambda表达式
        userInter(() -> {
            System.out.println("lambda表达式，重写后的show方法");
        });

    }

    public static void userInter(InterA a) {
        a.show();
    }
}

@FunctionalInterface
interface InterA {
    void show();
}