package com.itheima.lambda.test;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {

        userRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        System.out.println("-------------------------------");

        userRandomNumHandler(() -> new Random().nextInt(100) + 1);
    }

    public static void userRandomNumHandler(RandomNumHandler handler) {
        int result = handler.getNumber();
        System.out.println(result);
    }

}

interface RandomNumHandler {
    int getNumber();
}