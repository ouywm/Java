package com.itheima.scanner;

import java.util.Scanner;
/*
    Scanner 键盘录入字符：
        String next() : 遇到了空格，或者是tab键 就不在录入

        String nextLine() : 以回车作为结束的标记

        弊端：
                1.next() : 数据可能录入不完整
                2.nextLine() : 之前调用过nextInt() 或者，nextDouble(),nextFloat()等等。。
                        nextLine()方法就不干活了

        解决方案：
                Scanner : 采集用户信息(只是在学习中用得到)


        目前使用的方案：
                需求如果要键盘录入字符串
                        如果所有的数据都是字符串，直接nextLine();
                            举例：
                                键盘录入用户名密码
                        如果数据除了字符串还有其他类型，需要调用next()方法
                            举例：
                                键盘录入用户名，键盘录入用户年龄，用户身高
 */
public class scannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println(username);

        System.out.println("请输入密码：");
        String password = sc.nextLine();
        System.out.println(password);



    }
}
