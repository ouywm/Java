package com.itheima.loop;

public class WhileDemo {
    public static void main(String[] args) {
        whileTest();
    }
    /*
        while循环格式:

            初始化语句;
            while(判断条件){
                循环体语句;
                条件控制语句;
            }

        执行流程:

           1. 执行初始化语句
           2. 执行判断条件,看其返回结果是true , false
                    false : 结束循环
                    true : 静茹第三步

           3.执行循环体语句
           4.执行条件控制语句
           5.回到2继续
     */

    public static void whileTest() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("黑马程序员");
        }
        System.out.println("--------------------------------");

        int i = 1;
        while (i <= 5){
            System.out.println("黑马程序员");
            i++;
        }
    }
}
