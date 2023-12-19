package com.itheima.jdk8.p7_Zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    /*
        ZoneDataTime 带时区的时间对象 :

            static ZonedDateTime now() : 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(...) : 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) : 修改时间系列的方法
            ZonedDateTime minusXxx(时间) : 减少时间系列的方法
            ZonedDateTime plusXxx(时间)  : 增加时间系列的方法
     */
    public static void main(String[] args) {

        // 获取当前时间的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println("--------------------------");

        // 获取指定时间的ZonedDateTime对象
        ZonedDateTime of = ZonedDateTime.of
                (2008, 8, 8, 8, 8, 8, 8,
                        ZoneId.systemDefault());
        System.out.println(of);
        System.out.println("--------------------------");

        // 修改时间系列的方法
        System.out.println(now.withYear(2008));
        System.out.println(now.withMonth(8));
        System.out.println(now.withDayOfMonth(8));
        System.out.println("--------------------------");

        // 减少时间系列的方法
        System.out.println(now.minusYears(1));
        System.out.println(now.minusMonths(1));
        System.out.println(now.minusDays(1));
        System.out.println("--------------------------");

        // 增加时间系列的方法
        System.out.println(now.plusYears(1));
        System.out.println(now.plusMonths(1));
        System.out.println(now.plusDays(1));
    }
}
