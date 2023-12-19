package com.itheima.test;

import java.util.Scanner;

public class Test06 {
    /*
        需求:
            在编程竞赛中,有六个评委为参赛的选手打分,分数为0~100的整数分,
            选手最后的的氛围,去掉一个最高分和一个最低跟,的44个评委平均值

            1.基本的实现(不考虑分数校验)
            2.校验键盘录入的信息是否是0~100之间
            3.抽取方法

     */
    public static void main(String[] args) {

        int[] arr = initData();

        int sum = getSum(arr);

        int max = getMax(arr);

        int min = getMin(arr);

        //5.求平均分 (总和 - 最大值 - 最小值) / 4
        double avg = ((sum - max - min) * 1.0) / (arr.length - 2);

        System.out.println("选手的最后得分为:" + avg);

    }

    /**
     * 数组中招最小值
     */
    private static int getMin(int[] arr) {
        //4.求一个最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     *数组中找最大值
     */
    private static int getMax(int[] arr) {
        //3.求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 数组求和
     * @param arr
     * @return sum
     */
    private static int getSum(int[] arr) {
        //2.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 此方法用于六个评委的分数
     * @return arr
     */
    private static int[] initData() {
        int[] arr = new int[6];
        //1.键盘录入这六个评委的打分
        Scanner input = new Scanner(System.in);
        System.out.println("请输入六个评委的打分: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位:");
            int score = input.nextInt();
            //判断成绩是否正确
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("您的分数有误,请检查是否是0~100之间的");
                i--;
            }
        }
        return arr;
    }
}
