package com.itheima.lambda.test;

public class LambdaTest4 {
    public static void main(String[] args) {

        userCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        System.out.println("-------------------------------");

        userCalculator((a, b) -> a - b);
    }

    public static void userCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}
