package com.itheima.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {

//        String Time = time();
        System.out.println(TimeTest.time());
    }

    public static String time() {
        Date date = new Date();
        SimpleDateFormat format = new
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);



        return dateStr;
    }
}
