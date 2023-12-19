package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest03 {

    /*
        数组两种初始化的区别 :

                    动态初始化 : 手动指定长度,系统分配默认初始值

                    静态初始化 : 手动指定元素,系统会根据元素的个数,计算出数组的长度

            两种初始化的使用选择 :
                    1.静态初始化 : 如果要操作的数据,需求中已经明确给出了,直接静态初始化
                                    需求 :  已知班级学生成绩为100 100 90 20 100 找出最高分
                                    int[] arr = {100,100,90,20,100};
                    2.动态初始化 : 只明确元素个数,不明确具体数值

                                    需求1 : 键盘录入五个学生成绩,找出最高分
                                    int[] arr2 = new int [5];

                                    需求2 : 产生10个1~100之间的随机数,并找出最小值


            Ctrl + Alt + M  抽取方法的快捷键

     */
    public static void main(String[] args) {
        /*int max1 = getMax1();
        System.out.println("最高分是:" + max1 + "分");*/
        //------------------------------------------------
        int[] randomNums = intArrayFromRandom();

        int min = getMin(randomNums);
        System.out.println("最小值为:" + min);
    }

    private static int[] intArrayFromRandom() {
        Random r = new Random();
        int[] randomNums = new int[10];

        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextInt(100) + 1;
            System.out.println(randomNums[i]);
        }
        return randomNums;
    }

    /**
     * 需求1 : 键盘录入五个学生成绩,找出最高分
     * int[] arr2 = new int [5];
     */
    public static int getMax1() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入班级人数:");
        int NumBer = input.nextInt();
        int[] arr = new int[NumBer];
        int Max1 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i + 1) + "名同学分数:");
            arr[i] = input.nextInt();

            if (arr[i] > Max1) {
                Max1 += arr[i];
            }
        }
        return Max1;
    }

    /**
     * 从数组中招最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max += arr[i];
            }
        }
        return max;
    }

    /**
     * 从数组中找最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
