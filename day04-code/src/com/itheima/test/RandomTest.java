package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        guessNumber();
    }
    /*
        需求: 实现猜数字小游戏

        1.使用Random 产生一个1~100之间的随机数  --> randomNumber

        2.使用Scanner从键盘录入用户猜的数据    -->scNumBer

        3.比对
     */

    public static void guessNumber(){

        Random r = new Random();

        Scanner input = new Scanner(System.in);

        //1.使用Random 产生一个1~100之间的随机数  --> randomNumber
        int randomNumber = r.nextInt(100)+1;

        System.out.println(randomNumber);
        while (true){
            //2.使用Scanner从键盘录入用户猜的数据    -->scNumBer
            System.out.print("请输入:");
            int scNumber = input.nextInt();

            if(scNumber > randomNumber){
                System.out.println("猜大了");
            }else if(scNumber < randomNumber) {
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("恭喜");
    }
}
