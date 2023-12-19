package com.itheima.lambda.test;

public class LambdaTest2 {
    public static void main(String[] args) {

        userStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类打印：" + msg);
            }
        });
        System.out.println("-------------------------------");

        userStringHandler(msg ->System.out.println("Lambda表达式打印：" + msg));




    }

    public static void userStringHandler(StringHandler stringHandler) {

        stringHandler.printMessage("itheima");

    }
}

@FunctionalInterface
interface StringHandler {
    void printMessage(String msg);
}