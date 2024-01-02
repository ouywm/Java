package com.itheima.file;

import java.io.File;

public class FileTest2 {
    /*
        需求: 键盘录入一个文件夹路径，找出这个文件夹下所有的 .java 文件
     */
    public static void main(String[] args) {
        File dir = FileTest1.getDir();

        printJavaFile(dir);
    }

    /**
     * 对接收到的文件夹路径进行遍历, 找出所有的.java文件
     */
    public static void printJavaFile(File dir) {
        // 1. 获取当前路径下所有的文件和文件夹对象
        File[] files = dir.listFiles();

        // 2. 对数组遍历, 获取每一个文件或文件夹对象
        for (File file : files) {
            // 3. 判断是否是.java文件
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file);
                }
            } else {
                // 4. 代码执行到这里, 说明是文件夹
                // 思路: 调用方法, 进入这个文件夹继续找.java文件
                if (file.listFiles() != null) {
                    printJavaFile(file);
                }
            }
        }
    }


    private static void method(File dir) {
        // 获取当前路径下所有的文件和文件夹对象
        File[] files = dir.listFiles();
        // 遍历数组, 获取每一个文件或文件夹对象
        for (File file : files) {
            // 判断是否是文件, 并且文件的后缀名需要.java结尾
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file);
            }
        }
    }
}
