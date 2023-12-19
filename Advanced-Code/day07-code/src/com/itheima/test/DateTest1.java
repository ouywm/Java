package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest1 {
    /*
        需求：计算你来到这个世界多少天

        分析：
                1.键盘录入用户的生日(日期字符串)
                2.创建SimpleDateFormat,指定模式，用于将日期字符串解析为Date日期对象(birthdayDate)
                3.创建Date日期对象，封装此刻的时间(todayDate)
                4.long time = todayDate.getTime() - birthdayDate.getTime;
                5.将毫秒值，转换为天的单位

                            time / 1000 / 60 / 60 / 24;
     */

    public static void main(String[] args) throws ParseException {
        //1.键盘录入用户的生日(日期字符串)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：xxxx年xx月xx日");
        String birthday = sc.nextLine();

        // 2.创建SimpleDateFormat,指定模式，用于将日期字符串解析为Date日期对象(birthdayDate)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        //生日那一天的日期对象
        Date birthdayDate = simpleDateFormat.parse(birthday);

        //3.创建Date日期对象，封装此刻的时间(todayDate)
        Date today = new Date();

        //计算用户活了多少毫秒
        long time = today.getTime() - birthdayDate.getTime();

        //5.将毫秒值，转换为天的单位
        time = time / 1000 / 60 / 60 / 24;
        System.out.println("您已经活了"+time+"天");

    }
}
