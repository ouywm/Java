package com.itheima.test;

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.print("请输入您要查找的元素:");
        int num = input.nextInt();

        int index = getIndex(num, arr);
        System.out.println(index);


    }

    /*

        需求 :
                设计一个方法,查找元素在数组中的索引位置

                查找元素,在数组中第一次出现的索引位置

                已知一个数组 arr = {19,28,37,46,50};

                键盘录入一个数据,超找该数据在数组中的索引

                并在控制台树池找到的索引值

                如果没有查找到,则输出 -1
     */
    public static int getIndex(int num, int[] arr) {
        //1.假设要查找的元素在数组中就是不存在的

        int index = -1;
        //2.遍历数组获取数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3.比较

            if (arr[i] == num) {
                //4.找到了,让index变量记录正确的索引位置

                index = i;
                break;
            }
        }
        return index;
    }
}
