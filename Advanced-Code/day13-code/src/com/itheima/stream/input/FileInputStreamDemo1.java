package com.itheima.stream.input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
	/*
		字节流读取数据

			public int read() : 读取单个字节
	 */
	public static void main(String[] args) throws IOException {


		FileInputStream fis = new FileInputStream("D:\\A.txt");

		// 这样子太慢了，效率不咋滴，这跟去超市似得，一个一个买鸡蛋回家，效率肯定低啊
		// 所以准备一个菜篮子还是有必要的
		int i;
		while ((i = fis.read()) != -1) {
			System.out.println((char) i);
		}

		fis.close();

	}
}
