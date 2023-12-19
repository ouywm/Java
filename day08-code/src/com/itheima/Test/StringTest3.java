package com.itheima.Test;

import java.util.Scanner;

public class StringTest3 {
    /*
        需求 ： 已字符串的形式从键盘接收一个手机号，将中间四位号码屏蔽
                    最终效果为 ： 1156****1234

        分析 ：
                1.键盘录入字符串
                2.截取前三位
                3.再截取出后四位
                4.前三位 + **** + 后面四位
     */
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String tel = sc.nextLine();
        //2.截取前三位
        //156JQKA1234
        String start = tel.substring(0, 3);

        //后四位
        String end = tel.substring(7);

        //4.前三位 + **** + 后面四位
        System.out.println(start + "****" + end);
    }
}
