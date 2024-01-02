package com.itheima.file;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo4 {
    /*
        File类的创建方法和删除方法 :

            public boolean createNewFile() :创建文件
            public boolean mkdir() : 创建单级文件夹
            public boolean mkdirs() : 创建多级文件夹
            public boolean delete() : 删除文件或文件夹
                            - delete 方法删除文件夹, 只能删除空的文件夹.
     */
    public static void main(String[] args) throws IOException {
        File f1 = new File("src\\com\\itheima\\day12\\B.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("src\\com\\itheima\\day12\\aaa");
        System.out.println(f2.mkdirs());

        File f3 = new File("src\\com\\itheima\\day12\\C.txt");
        System.out.println(f3.mkdirs());

        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
