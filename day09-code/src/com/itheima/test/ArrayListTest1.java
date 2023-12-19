package com.itheima.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    /*
        需求：创建一个储存字符串的集合，内部存储3个字符串元素，使用程序实现在控制台遍历该集合
     */

    /*
        需求 ： 创建一个储存字符串的集合，内部存储字符串元素


                钢门吹雪，西域狂鸭，张三，甄妮玛黛女今，李四

                使用程序实现在控制台遍历该集合，将四个字的人命，打印在控制台
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("钢门吹雪");
        list.add("西域狂鸭");
        list.add("张三");
        list.add("甄妮玛黛女今");
        list.add("李四");


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() == 4) {
                System.out.println(s);
            }
        }

    }
}
