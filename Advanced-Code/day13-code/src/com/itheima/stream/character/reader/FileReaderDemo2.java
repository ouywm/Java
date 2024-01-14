package com.itheima.stream.character.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	/**
	 * Debug查看读取过程
	 */

	/*
		也有内置数组
		调用read方法的时候，表面上是读取一个，但是实际上是读取8192个字节，把内部数组装满，然后判断第一个读取到的字节是正数还是负数，如果是正数，读取到的就是一英文，会直接转换让int接收，如果读取第一个字节是负数，那
		说明是一个中文，那就会结合平台默认编码读取几个，默认是utf-8，就读取三个字节，这三字节转换成字符‘你’，然后交给int变量接收
	 */
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\B.txt");

		int i1 = fr.read();
		System.out.println((char) i1);


		int i2 = fr.read();
		System.out.println((char) i2);

		int i3 = fr.read();
		System.out.println((char) i3);

		int i4 = fr.read();
		System.out.println((char) i4);

		fr.close();

	}
}
