package com.itheima.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculateAgeTest {
    /*
            需求 : 键盘录入用户生日，计算出用户的实际年龄
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日:");
        String birthday = sc.nextLine();

        //1.将键盘录入的日期字符串，转换为日期对象(生日那一天的)
        LocalDate birthdayDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy年M月d日"));

        //2.获取今天的日期对象
        LocalDate now = LocalDate.now();

        //3.计算时间间隔
        long result = ChronoUnit.YEARS.between(birthdayDate, now);
        System.out.println(result);
    }
}
