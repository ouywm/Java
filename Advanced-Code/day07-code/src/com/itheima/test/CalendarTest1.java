package com.itheima.test;

import java.util.Calendar;

public class CalendarTest1 {
    /*
          使用程序判断2050年3月1日 是否为疯狂星期四
     */

    public static void main(String[] args) {
        //1.获取日期对象(此刻的时间)
        Calendar c = Calendar.getInstance();
        //2.设置为2050年3月1日，调用set方法
        c.set(2050, 2, 1);

        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};
        //               0    1     2     3     4    5     6    7
        //3.获取星期
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);

        if (weeks[weekIndex] == '四') {
            System.out.println("今天是疯狂星期四，大吃一顿");
        } else {
            System.out.println("今天不是疯狂星期四，根本吃不起");

        }
    }
}
