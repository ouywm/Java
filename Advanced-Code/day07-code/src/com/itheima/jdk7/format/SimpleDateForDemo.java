package com.itheima.jdk7.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateForDemo {
    /*
        SimpleDateFormat类 ： 用于日期格式化

        1.构造方法 ：

                public SimpleDateFormat() : 创建一个日期格式化对象，用于[默认格斯]
                public SimpleDateFormat(String pattern) : 创建一个日期格式化对象,[手动指定模式]

        2.常用方法：

                public final String format(Date date) : 将日期对象，转换为字符串
                public final Date parse(String source) : 将日期字符串，解析为日期对象

     */

    public static void main(String[] args) throws ParseException {

        String today = "2023年12月04日";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = simpleDateFormat.parse(today);

        System.out.println(date);

    }

    private static void method() {
        //创建了一个日期格式化对象使用[默认格式]
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        //创建一个日期格式化对象，[手动指定模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        //创建Date对象，封装此刻的时间
        Date date = new Date();

        //调用里面的将字符创对象，转换为字符串
        String result = simpleDateFormat.format(date);
        System.out.println(result);
    }
}
