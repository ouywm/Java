package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	/*
		流对象使用完之后需要关闭
		不关闭，java就一直占用着这个文件
	 */

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\B.txt");

		fos.write("abc".getBytes());

		fos.close();

		while (true) {
		}
	}
}
