package com.itheima.control;

import java.util.Scanner;

public class BreakDemo {

    /*
        break : 结束循环,结束switch

        注意事项: 只能在循环或者switch中使用
     */
    public static void main(String[] args) {
        login();
    }
    /*
        需求: 模拟用户登录,一共给三次机会
                假设密码是123456
     */

    public static void login() {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++ ) {
            System.out.println("请输入密码:");
            int password = input.nextInt();

            if (password == 123456) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败,密码有误");
            }
        }
    }
}
