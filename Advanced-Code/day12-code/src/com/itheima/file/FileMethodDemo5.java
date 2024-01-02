package com.itheima.file;

import java.io.File;

public class FileMethodDemo5 {
    /*
        File类的遍历方法 :

            public File[] listFiles() 获取当前目录下所有的  "一级文件对象"  返回 File 数组

     */
    public static void main(String[] args) {
        File f = new File("D:\\test");

        File[] files = f.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
}
