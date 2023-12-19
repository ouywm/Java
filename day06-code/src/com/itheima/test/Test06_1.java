package com.itheima.test;

import java.util.Scanner;

public class Test06_1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner input = new Scanner(System.in);

        System.out.println("请输入六位评委的打分:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int max = 0;
        max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
    }
}
