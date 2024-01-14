package com.itheima.stream.input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
	/*
		字节流读取数据：
				public int read(byte[] bys : 读取一个字节数组)
				            - 将读取到的字节，存入到数组容器，返回读取到的有效字节个数
	 */

	public static void main(String[] args) throws IOException {

		// 准备容器，接收读取出来的
		byte[] bys = new byte[2];
		// 创建字节读取流对象
		FileInputStream fis = new FileInputStream("D:\\A. txt");
		// 读取到的个数
		int len;
		// 循环读取，读取出来的个数不等于-1，就是读取到文件了
		while((len = fis.read(bys)) != -1){
			// String对象，构造方法一个字节数组，从0开始，到哪里
			String s = new String(bys,0,len);
			System.out.print(s);
		}
		// 关闭字节流
		fis.close();

	}
}
