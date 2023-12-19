package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {

        int[] arr = {100, 50, 20, 90, 90};

        int max = getMax(arr);
        System.out.println("最高分为: " + max);

        int min = getMin(arr);
        System.out.println("最低分为: " + min);

        int sum = getSum(arr);
        System.out.println("班级总成绩为: " + sum);

        double avg = getAvg(arr);
        System.out.println("班级平均分为: " + avg);

        int count = getCount(arr);
        System.out.println("低于平均分人数为: " + count);


    }

    /*
        需求 : 已知元素为 {5,44,33,55,22} 请找出数组中最大值并打印在控制台

                分析 :
                            1第一名选手上台(假设第一个元素就是最大值)
                            2.遍历数组,获取到每一个元素
                            3.做个比较
                            4.记录最大的元素
     */
    public static int getMax(int[] arr) {

//        int[] arr = {5,44,33,55,22};

        //1第一名选手上台(假设第一个元素就是最大值)
        int max = arr[0];
        //2.遍历数组,获取到每一个元素
        for (int i = 1; i < arr.length; i++) {
            //3.做个比较
            if (arr[i] > max) {
                //4.记录最大的元素
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 从数组中找最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 数组求和
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 数组求平均值
     */
    public static double getAvg(int[] arr) {
        int sum = getSum(arr);
        //计算平均分
        double avg = (double) sum / arr.length;
        return avg;
    }

    /**
     * 统计低于平均值元素的个数
     */
    public static int getCount(int[] arr) {
        //1.定义计数器变量
        int count = 0;
        //2.计算平均分
        double avg = getAvg(arr);
        //3.统计
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }

    /*

        需求 :
            已知班级学生成绩为
            int[] arr = {100,50,20,90,90};
            1.找出数组最大值,并打印在控制台
            2.找出数组最小值,并打印在控制台
            3.求出总成绩,并打印在控制台
            4.计算出平均值,并打印在控制台
            5.统计处低于平均值元素的个数

     */
}
