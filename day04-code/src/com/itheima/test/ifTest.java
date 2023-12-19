package com.itheima.test;

import java.util.Scanner;

public class ifTest {

    public static void main(String[] args) {

        queryPrizeScore();
    }

    /*
        需求:键盘录入用户输入的密码,如果是123456,程序输出(密码正确),否则的话输出(密码错误)

        ctrl + alt + L : 格式化代码
     */
    public static void chenPasswor() {
        Scanner input = new Scanner(System.in);
        //1.准备Scanner键盘录入精灵
        System.out.print("请输入密码:");
        //2.指挥精灵从键盘录入密码
        int password = input.nextInt();
        //3.使用if语句判断密码是否正确
        if (password == 123456) {

            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }

    /*
    需求:键盘录入学生的考试成绩,根据成绩所在的区间,打印出不同的奖励
        95~100 : 自行车一辆
        90~94 :游乐场玩一次
        80~90 : 变形金刚一个
        80分以下 : 挨揍

        分数:     0-100
 */
    public static void queryPrizeScore() {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入您的分数:");

        int score = input.nextInt();

       /* if (score >= 95 && score <= 100) {

            System.out.println("自行车一辆");

        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚一个");
        } else if( score >= 0 && score < 79){
            System.out.println("挨揍");
        }else {
            System.out.println("输入错误");
        }*/

        /*if (score < 0 || score > 100) {
            System.out.println("您的输入有误请检查是否为0~100之间");
        } else if (score >= 95 && score <= 100) {
            System.out.println("自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚一个");
        } else if (score >= 0 && score < 79) {
            System.out.println("挨揍");
        } else {
            System.out.println("输入错误");

        }*/

        if (score >= 0 && score < 100) {
            //合理的成绩
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一次");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚一个");
            } else if (score >= 0 && score < 79) {
                System.out.println("挨揍");
            }
        } else {
            System.out.println("您的输入有误,请检查是否是0~100之间!");
        }
    }
}

