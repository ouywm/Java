package com.itheima.stream.hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class test1 {
	/*
        FileUtil类:
                file：根据参数创建一个file对象
                touch：根据参数创建文件

                writeLines：把集合中的数据写出到文件中，覆盖模式。
                appendLines：把集合中的数据写出到文件中，续写模式。
                readLines：指定字符编码，把文件中的数据，读到集合中。
                readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中

                copy：拷贝文件或者文件夹
    */
	public static void main(String[] args) {

		// 读取数据放到集合
		List<String> list = FileUtil.readLines("D:\\a.txt", "UTF-8");
		System.out.println(list);

	}

	private static void method2() {
		// 创建集合添加数据
		ArrayList<String> list = new ArrayList<String>();
		list.add("你好");
		list.add("你好");
		list.add("你好");

		// 追加写入
		File file3 = FileUtil.appendLines(list, "D:\\a.txt", "UTF-8");
		System.out.println(file3);
	}

	private static void method1() {
		// 强大的糊涂包，可变参数
		File file1 = FileUtil.file("D:\\", "aaa", "bbb", "a.txt");
		System.out.println(file1);

		// 创建文件夹，直接把父级路径也给一起创建出来了
		File touch = FileUtil.touch(file1);
		System.out.println(touch);

		// 创建集合添加数据
		ArrayList<String> list = new ArrayList<String>();
		list.add("你好");
		list.add("你好");
		list.add("你好");

		// 将集合中的数据写到文件中
		File file2 = FileUtil.writeLines(list, "D:\\a.txt", "UTF-8");
		System.out.println(file2);
	}
}
