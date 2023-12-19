package com.itheima.jdk8.p1_local_date_time;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // 日期 时间
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是：" + nowDateTime);
        // 年
        System.out.println(nowDateTime.getYear());
        // 月
        System.out.println(nowDateTime.getMonthValue());
        // 日
        System.out.println(nowDateTime.getDayOfMonth());
        // 时
        System.out.println(nowDateTime.getHour());
        // 分
        System.out.println(nowDateTime.getMinute());
        // 秒
        System.out.println(nowDateTime.getSecond());
        // 纳秒
        System.out.println(nowDateTime.getNano());

        // 日 : 当年的第几天
        System.out.println("dayOfYear：" + nowDateTime.getDayOfYear());
        // 星期
        System.out.println("星期" + nowDateTime.getDayOfWeek());
        System.out.println("星期" + nowDateTime.getDayOfWeek().getValue());
        // 月份
        System.out.println("月份" + nowDateTime.getMonth());
        System.out.println("月份" + nowDateTime.getMonth().getValue());
    }
}
