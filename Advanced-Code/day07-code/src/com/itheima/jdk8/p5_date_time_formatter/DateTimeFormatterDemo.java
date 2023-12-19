package com.itheima.jdk8.p5_date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    /*
        用于时间的格式化和解析:

        1. 对象的获取 :

                static DateTimeFormatter ofPattern(格式) : 获取格式对象

        2. 格式化 :

                String format(时间对象) : 按照指定方式格式化

        3. 解析 :

                LocalDateTime.parse("解析字符串", 格式化对象);
                LocalDate.parse("解析字符串", 格式化对象);
                LocalTime.parse("解析字符串", 格式化对象);

     */
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("格式化之前:" + now);

        // 获取格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        // 格式化
        String result = formatter.format(now);
        System.out.println("格式化之后:" + result);

        // 解析
        String time = "2008年08月08日";
        LocalDate parse = LocalDate.parse(time, formatter);
        System.out.println(parse);

    }
}
