package com.itheima.test;

public class Test05_1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55,66};

        int start = 0, end = arr.length - 1;

        for (; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
