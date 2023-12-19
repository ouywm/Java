package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    /*
        需求: 请从26个英文字母(大小写都包含),以及数字0-9中,随机产生一个5位的字符串验证码并打印在控制台

        效果:uYq8I , 3r4zj

     */
    public static void main(String[] args) {

        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };

        Random r = new Random();

        String checkCode = "";

        for (int i = 1; i <= 5; i++) {

            int index = r.nextInt(chs.length);

            checkCode += chs[index];
            System.out.print(chs[index]+" ");
        }
        System.out.println("\n");
        System.out.println("产生的验证码为:"+checkCode);

        System.out.println();
        System.out.print("请输入验证码:");
        Scanner input = new Scanner(System.in);

        String inputCheckCode = input.next();

        if (checkCode.equals(inputCheckCode)) {
            System.out.println("验证码正确!");
        }else{
            System.out.println("验证码不正确");
        }

    }
}
