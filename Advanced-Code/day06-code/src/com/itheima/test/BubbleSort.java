package com.itheima.test;

import java.util.Arrays;

public class BubbleSort {
    /*
            冒泡排序 ： 相邻两个数进行比较，如果第一个比第二个大，就交换他们两个

            第一轮 ： arr[0]-arr[1]    arr[1]-arr[2]    arr[2]-arr[3]    arr[3]-arr[4]      比较4次
            第二轮 ： arr[0]-arr[1]    arr[1]-arr[2]    arr[2]-arr[3]    比较3次
            第三轮 ： arr[0]-arr[1]    arr[1]-arr[2]    比较2次
            第四轮 ： arr[0]-arr[1]    比较1次

     */
    public static void main(String[] args) {

        int[] arr = {22, 55, 44, 33, 11};

        //外循环 ： 比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环 : 比较的次数
            // - 1 : 避免索引越界
            // - i : 提高效率
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // j = 0 1 2 3 4
                // j = 0        arr[0] arr[1]
                // j = 1        arr[1] arr[2]
                // j = 2        arr[2] arr[3]
                // j = 3        arr[3] arr[4]
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
