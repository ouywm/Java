package com.itheima.exception;

public class ExceptionDemo3 {
    /*
            Java对于异常的默认处理方式 ： 向上抛出
     */

    public static void main(String[] args) {

        System.out.println("开始");
        method();                           //new ArithmeticException();    JVM虚拟机
        System.out.println("结束");

    }

    public static void method() {
        System.out.println(10 / 0);           //new ArithmeticException();
    }

}
