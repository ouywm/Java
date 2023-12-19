package com.itheima.demo;

public class SwapDemo2 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        //数组中的第一个元素,和最后一个元素进行交换

        //1.确定好,谁跟谁做交换          arr[0]   arr[arr.length-1]

        //2.定义第三方变量,倒手
        int temp = arr[0];

        arr[0] = arr[4];

        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
