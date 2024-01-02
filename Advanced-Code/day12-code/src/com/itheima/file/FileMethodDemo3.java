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
        System.out.println(f1.isDirectory());       // false
        System.out.println(f1.isFile());            // true
        System.out.println(f1.exists());            // true

        System.out.println("----------------------");

        File f2 = new File("D:\\test");

        System.out.println(f1.length());
        System.out.println(f2.length());

        System.out.println("----------------------");

        File f3 = new File("A.txt");
        System.out.println(f3.getAbsolutePath());

        System.out.println("----------------------");

        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.getName());

        System.out.println("----------------------");

        long time = f1.lastModified();
        System.out.println(new Date(time));
    }
}
