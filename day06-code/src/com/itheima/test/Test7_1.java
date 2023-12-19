package com.itheima.test;

import java.util.Random;

public class Test7_1 {
    /*
       需求: 请从26个英文字母(大小写都包含),以及数字0-9中,随机产生一个5位的字符串验证码并打印在控制台

       效果:uYq8I , 3r4zj

       注意事项:打印字符类型数组名,不会看到地址值,会看到

    */
    public static void main(String[] args) {

        char[] chs = getContents();

        String checkCode = getCheckCode(chs);

        System.out.println("产生的验证码为:" + checkCode);

    }

    private static String getCheckCode(char[] chs) {

        Random r = new Random();

        String checkCode = "";

        for (int i = 1; i <= 5; i++) {

            int randomIndex = r.nextInt(chs.length);

            checkCode += chs[randomIndex];

        }
        return checkCode;
    }

    private static char[] getContents() {
        char[] chs = new char[26 + 26 + 10];

        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[index] = c;
            index++;
        }
        System.out.println();
        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index] = c;
            index++;
        }
        System.out.println();
        for (char c = '0'; c <= '9'; c++) {
            chs[index] = c;
            index++;
        }
        return chs;
    }
}
