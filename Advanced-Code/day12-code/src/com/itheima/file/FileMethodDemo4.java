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
        File f1 = new File("day12-code\\src\\com\\itheima\\B.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("day12-code\\src\\com\\itheima\\aaa\\bbb\\ccc");
        System.out.println(f2.mkdirs());

        File f3 = new File("day12-code\\src\\com\\itheima\\C.txt");
        System.out.println(f3.mkdirs());

        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
