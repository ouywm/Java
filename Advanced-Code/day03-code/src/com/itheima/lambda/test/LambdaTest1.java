package com.itheima.lambda.test;

public class LambdaTest1 {
    public static void main(String[] args) {

        userShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，重写后的show方法...");
            }
        });
        System.out.println("-------------------------------");

        userShowHandler(() -> System.out.println("Lambda表达式，重写后的show方法..."));

    }

    public static void userShowHandler(ShowHandler showHandler) {

        //ShowHandler showHandler = new ShowHandler(){
        //            @Override
        //            public void show() {
        //                System.out.println("我是匿名内部类，重写后的show方法...");
        //            }
        //};

        showHandler.show();
    }

}

interface ShowHandler {
    void show();
}