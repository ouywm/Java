package com.itheima.file;

import java.io.File;

public class FileTest3 {
    /*
        需求: 设计一个方法, 删除文件夹 (delete() 只能删除空文件夹)
     */
    public static void main(String[] args) {
        deleteDir(new File("D:\\test2"));
    }

    public static void deleteDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            // 判断是不是文件
            if (file.isFile()) {
                // 是文件直接删
                file.delete();
            } else { // 代码走到这，说明不是文件，而是文件夹
                // 文件夹的话, 需要进入文件夹继续删除.
                if (file.listFiles() != null) {
                    // 递归调用
                    deleteDir(file);
                }
            }
        }
        // 循环结束后, 删除空文件夹，文件夹里面的文件已经全部删除了
        dir.delete();
    }
}
