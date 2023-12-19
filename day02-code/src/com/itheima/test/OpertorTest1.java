package com.itheima.test;
import java.util.Scanner;
public class OpertorTest1 {
    /*
    需求:键盘录入三个数,将数值拆分出个位,十位,百位,然后打印到控制台
    数值拆分公式:
        个位:数值 % 10
        十位: 数值 / 10 % 1
        百位:数值 /10 /10 % 10
        千位:数值 / 10 / 10 /10 % 1
        对于数值的最高位,简化处理:
            123 :    百位       123 / 100--->1
            1234 :   千位       1234 / 1000 ---> 1
            12345 :  万位       12345 / 10000---> 1
 */
    public static void main(String[] args) {
        //召唤精灵
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        //指挥精灵,从键盘录入一个整数
        int num = input.nextInt();
        //数值拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
//        int bai = num / 10 /10 % 10;
        int bai = num / 100;
        //将拆分后的数据,打印在控制台
        System.out.println("整数" + num + "的个位数是:"+ge);
        System.out.println("整数" + num + "的十位是:"+shi);
        System.out.println("整数" + num + "的百位是:"+bai);

    }
}
