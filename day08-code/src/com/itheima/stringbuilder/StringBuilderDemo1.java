package com.itheima.stringbuilder;

public class StringBuilderDemo1 {

    /*
            StringBuilder类的作用，提高字符串的操作效率

                    1.StringBuilder的特点
                    2.StringBuilder的构造方法
                    3.StringBuilder常用成员方法
                    4.练习
                    5.StringBuilder提高效率
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <=10000 ; i++) {
            sb = sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void menthod() {
        // 获取1970年1月1日0时0分0秒到现在所经历过的毫秒值
        long start = System.currentTimeMillis();

        String s = "";

        for (int i = 1; i <=10000 ; i++) {
            s += i;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();

        System.out.println(end - start);     // 183ms
    }

}
