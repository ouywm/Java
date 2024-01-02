package com.itheima.file;

import java.io.File;
import java.util.Scanner;

public class FileTest1 {
    /*
        需求: 键盘录入一个文件夹路径，如果输入错误就给出提示，并继续录入，直到正确为止
     */
    public static void main(String[] args) {

        File dir = getDir();
        System.out.println(dir);

    }

    public static File getDir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径: ");
        while (true) {
            String path = sc.nextLine();

            File dir = new File(path);

            if (!dir.exists()) {
                System.out.println("您输入的文件夹路径不存在, 请重新输入: ");
            } else if (dir.isFile()) {
                System.out.println("您输入的是一个文件路径, 请重新输入一个文件夹路径: ");
            } else {
                return dir;
            }
        }
    }
}
