package com.itheima.Test;

import java.util.Scanner;

public class StringTest4 {
    /*
        需求 ：键盘录入一个 字符串，如果字符串中包含(TMD)，则使用 *** 替换
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String content = sc.nextLine();

        content = content.replace("TMD","***");

        System.out.println(content);
    }
}
