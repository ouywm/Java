package com.itheima.test;

public class Test5 {
    /*
        已知一个数组 arr = {11,22,33,44,55};用程序实现把数组中的元素值交换
        交换后的数组 arr = {55,44,33,22,11};并在控制台输出交换后的数组

        1.确定好谁跟谁交换

                第一个和倒数第一个进行交互: arr[0] = arr[arr.length - 1];

                第二个和倒数第二个进行交换 : arr[1] = arr[arr.length -1-1]

                第三个和倒数第三个进行交换 : arr[1] = arr[arr.length -1-2]


                arr[i]  arr[arr.length-1-i]

        2.定义三方变量,套入公式

     */

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        reverseArray2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseArray2(int[] arr) {
        int start = 0,end = arr.length - 1;

        for (; start < end; start++, end--) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    private static void reverseArray1(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = temp;

        }
    }
}
