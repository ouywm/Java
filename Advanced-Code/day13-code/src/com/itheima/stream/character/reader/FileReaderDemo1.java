package com.itheima.stream.character.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	/*
		FileReader:用于读取纯文本文件，解决中文乱码问题

			构造方法：
				1.public FileReader(String fileName) 字符输入流关联文件，路径以字符串形式给出2
				2.public FIleReader(File file) 字符输入流关联文件，路径以File对象形式给出



			成员方法：
				public int read() : 读取单个字符
				public int read(char[] cbuf) : 读取一个字符数组，返回读取到的有效字符个数
	 */

	public static void main(String[] args) throws IOException {
		// 创建字符流输入流对象
		FileReader fr = new FileReader("D:\\A.txt");
		// 创建数组容器
		char[] chs = new char[1024];
		// 返回个数
		int len;
		// 只要读取东西了，返回值就不会是-1，如果是那就说明，读取到末尾了
		while ((len = fr.read(chs)) != -1) {
			// 利用String的构造方法，将数组容器里的值，转换成String
			String s = new String(chs, 0, len);
			System.out.println(s);
		}

		fr.close();
	}

	private static void method() throws IOException {
		FileReader fr = new FileReader("D:\\A.txt");

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}

		fr.close();
	}
}
