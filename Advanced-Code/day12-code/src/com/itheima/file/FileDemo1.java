package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    /*
        File类介绍 : 文件或文件夹对象

        构造方法 :
            1. public File (String pathname) : 根据传入的字符串路径封装File对象
            2. public File (String parent, String child) : 根据传入的父级路径和子级路径来封装File对象
            3. public File (File  parent, String child) : 根据传入的父级路径(File类型)和子级路径来封装File对象

     */
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\A.txt");
        f1.createNewFile();

        File f2 = new File("D:\\test");
        System.out.println(f2.exists());

        File f3 = new File("D:\\", "test");
        System.out.println(f3.exists());

        File f4 = new File(new File("D:\\"), "test");
        System.out.println(f4.exists());
    }
}
