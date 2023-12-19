package com.itheima.test;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        triangle();
    }

    public static void triangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入你要打印的三角形的行数:");
        int LineNumber = input.nextInt();
        for (int i = 1; i <= LineNumber; i++) {
            for (int k = 1; k <= LineNumber - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= LineNumber; i++) {
            for (int k = 1; k <= LineNumber - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


