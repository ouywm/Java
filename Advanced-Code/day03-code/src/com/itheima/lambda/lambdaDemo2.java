package com.itheima.lambda;

public class lambdaDemo2 {
    /*
            lambda 表达式只允许函数式编程接口 ： 有且只有一个抽象方法的接口
     */
    public static void main(String[] args) {

        userInterB(new InterB() {
            @Override
            public void show1() {
                System.out.println("匿名内部类...show1...");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类...show2...");
            }
        });


//        userInterB( () -> {} );
    }

    public static void userInterB(InterB b) {
        b.show1();
        b.show2();
    }
}
//@FunctionalInterface
interface InterB {
    void show1();

    void show2();
}