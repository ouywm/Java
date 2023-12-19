package com.itheima.Test;

import java.util.Scanner;

public class StringTest1 {
    /*
        需求 ： 模拟用户登录，一共三次机会，登录之后要给出相应的提示

        分析：

                1. 定义两个字符串变量，模拟已经存在的用户名和密码

                2. 键盘录入用户输入的用户名，密码

                3. 比对

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 定义两个字符串变量，模拟已经存在的用户名和密码
        String username = "admin";
        String password = "123456";


        for (int i = 1; i <= 3; i++) {
            //1. 定义两个字符串变量，模拟已经存在的用户名和密码
            System.out.println("请输入用户名：");
            String inputUsername = sc.nextLine();

            System.out.println("请输入密码：");
            String inputPassword = sc.nextLine();

            //3. 比对
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("明天再来！！！");
                } else {
                    System.out.println("登录失败，您还剩" + (3 - i) + "次机会");
                }
            }
        }
    }
}
