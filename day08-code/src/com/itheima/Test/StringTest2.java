package com.itheima.Test;

import java.util.Scanner;

public class StringTest2 {
    /*
            需求 ：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
            （不考虑其他字符）

            例如  : aAb3&c2B*4CD1

            小写字母 ： 3个

            大写字母 ： 4个

            数字字母 ： 4个

     */
    public static void main(String[] args) {
        //1.键盘录入一个字符
        Scanner sc = new Scanner(System.in);
        //2.定义三份计数器变量，用于统计操作
        //大写字母计数器
        int bigCount = 0;
        //小写字母计数器
        int smallCount = 0;
        //数字计数器
        int numberCount = 0;
        //3.遍历字符串获取到每一个字符
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        //4.在遍历的过程中，加入if判断，看字符属于哪一种类别
        for (int i = 0; i <= str.length() - 1; i++) {
            //获取到每一个字符
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                //5.对应计数器变量自增
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                //5.对应计数器变量自增
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                //5.对应计数器变量自增
                numberCount++;
            }
        }
        //6.在遍历结束后，将统计好的计数器变量，打印在控制台
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("数字有：" + numberCount + "个");
    }


}

