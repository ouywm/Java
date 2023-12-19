package com.itheima.jdk8.p2_local_time;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // 1、获取本地时间对象。
        LocalTime nowTime = LocalTime.now();
        // 今天的时间
        System.out.println("今天的时间：" + nowTime);

        // 时
        int hour = nowTime.getHour();
        System.out.println("hour：" + hour);

        // 分
        int minute = nowTime.getMinute();
        System.out.println("minute：" + minute);

        // 秒
        int second = nowTime.getSecond();
        System.out.println("second：" + second);

        // 纳秒
        int nano = nowTime.getNano();
        System.out.println("nano：" + nano);

    }
}
