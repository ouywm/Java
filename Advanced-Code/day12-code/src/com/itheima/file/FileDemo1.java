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


		操作文件 ： File
		File封装的对象仅仅回一个路径名，这个路径是可以存在的，也可以是不存在的
		createNewFile ：创建新文件(相对路径)
	 */
	public static void main(String[] args) throws IOException {

		File f1 = new File("D:\\A.txt");
		f1.createNewFile();

		File f2 = new File("D:\\test");
		f2.createNewFile();
		System.out.println(f2.exists());

		// 分开写父级路径，和子级路径
		File f3 = new File("D:\\", "test");
		System.out.println(f3.exists());

		// 第一个参数为File对象 ，第二个参数为字符串
		File f4 = new File(new File("D:\\"), "test");
		// 是否存在，存在: true 不存在: false
		System.out.println(f4.exists());
	}
}
