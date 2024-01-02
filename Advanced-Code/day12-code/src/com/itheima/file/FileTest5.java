package com.itheima.file;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class FileTest5 {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹中每种文件的个数并打印（考虑子文件夹）
            打印格式如下：
                txt:3个
                doc:4个
                jpg:6个
     */

    static HashMap<String, Integer> hm = new HashMap<>();
    static int count = 0;       // 统计没有后缀名的文件

    public static void main(String[] args) {

        File dir = FileTest1.getDir();

        getCount(dir);

        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key + ":" + value + "个");
            }
        });

        System.out.println("没有后缀名文件的个数为:" + count);

    }

    public static void getCount(File dir) {
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                // 文件的话, 统计个数
                // 1. 获取文件名
                String fileName = file.getName();
                if (fileName.contains(".")) {
                    // 2. 获取后缀名
                    String[] sArr = fileName.split("\\.");
                    String type = sArr[sArr.length - 1];
                    // 3. 统计
                    if (!hm.containsKey(type)) {
                        hm.put(type, 1);
                    } else {
                        hm.put(type, hm.get(type) + 1);
                    }
                } else {
                    // 没有后缀名, 单独统计
                    count++;
                }
            } else {
                // 文件夹的话, 递归调用
                if (file.listFiles() != null) {
                    getCount(file);
                }
            }
        }
    }
}
