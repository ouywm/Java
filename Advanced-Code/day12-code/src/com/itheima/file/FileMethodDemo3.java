package com.itheima.file;

import java.io.File;
import java.util.Date;

public class FileMethodDemo3 {
    /*
        File类常见方法 :

            1. 判断相关
                    public boolean isDirectory() : 判断是否是文件夹
                    public boolean isFile() : 判断是否是文件
                    public boolean exists() : 判断是否存在

            2. 获取相关
                    public long length() : 返回文件的大小(字节数量)
                                                * 文件对象操作, 返回正确的字节个数
                                                * 文件夹对象操作, 返回的是错误的字节个数

                    public String getAbsolutePath() : 返回文件的绝对路径
                    public String getPath() : 返回定义文件时使用的路径
                    public String getName() : 返回文件的名称，带后缀
                    public long lastModified() : 返回文件的最后修改时间（时间毫秒值）

     */
    public static void main(String[] args) {
        File f1 = new File("D:\\A.txt");
        // 判断是不是文件夹
        System.out.println(f1.isDirectory());       // false
        // 判断是不是文件
        System.out.println(f1.isFile());            // true
        // 判断是否存在
        System.out.println(f1.exists());            // true

        System.out.println("----------------------");

        File f2 = new File("D:\\test");

        // 返回字节
        System.out.println(f1.length());
        System.out.println(f2.length());

        System.out.println("----------------------");


        File f3 = new File("A.txt");
        // 获取绝对路径
        System.out.println(f3.getAbsolutePath());

        System.out.println("----------------------");
        // 获取创建对象，传入构造方法的值，有点鸡肋，构造方法里面写啥，就获取啥
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        System.out.println("----------------------");
        // 返回文件夹或者文件名字，是文件会带有后缀
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.getName());

        System.out.println("----------------------");

        long time = f1.lastModified();
        System.out.println(new Date(time));
    }
}
