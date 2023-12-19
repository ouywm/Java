package com.itheima.mswitch;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        switchTest3();
    }

    /*
        switch 语句的格式:
            switch(将要匹配的值){
                case 值1:
                语句体;
                break;

                case 值2:
                语句体;
                break;

                case 值3:
                语句体;
                break;

                ...
                default:
                语句体n+1;
                break;
-------------------------------------------------------------------------
         执行流程:

            1.拿着 () 中将要匹配的值,跟case给出的选项,逐个进行匹配
                匹配成功,执行对应的语句体,再由break结束掉整个的switch语句
            }

            2.如果给出所以case,都匹配失败了,将会执行最后的default,由break结束掉整个的switch语句

         需求:键盘录入一个整数,根据录入的数值程序打印对应的星期

            1 ---> 星期一
            2 ---> 星期二
            3 ---> 星期三
            ....
            7 ---> 星期天
            8 ---> 您输入的有误
     */
    public static void switchTest1() {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入:");

        int week = input.nextInt();

        switch (week) {

            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;

            case 3:
                System.out.println("星期三");
                break;

            case 4:
                System.out.println("星期四");
                break;

            case 5:
                System.out.println("星期五");
                break;

            case 6:
                System.out.println("星期六");
                break;

            case 7:
                System.out.println("星期日");
                break;

            default:
                System.out.println("您输入的有误");
        }
    }

    /*
        switch的注意事项:

            1.case 后面的值不允许重复

            2.case 后面的值, 只能是字面量 不能是变量

            3.switch () 中可以接受的类型

                    1).基本数据类型:byte short char int
                    2).引用数据类型:jdk5开始可以使枚举 jdk7开始可以是String字符串


             4.case穿透现象:
     */
    public static void switchTest2() {

        int week = 1;

        String a = "1";

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;

            case 2:
                System.out.println("星期二");
                break;

            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("您输入的有误");
                break;

        }
    }

    /*
        switch() case的穿透现象

        需求:
            键盘录入一个数值,1-5 : 输出工作日    6-7 输出休息日

        现象:
            多个case中,存在了重复的代码,考虑使用case穿透来优化代码

  ------------------------------------------------------------

        从jdk14开始,case后面允许编写多个数据,多个数据中间使用逗号分割
     */
    public static void switchTest3() {


        Scanner input = new Scanner(System.in);

        System.out.println("请输入:");

        int week = input.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");

            case 6, 7 -> System.out.println("休息日");

            default ->System.out.println("输入有误");

        }

    }
}

