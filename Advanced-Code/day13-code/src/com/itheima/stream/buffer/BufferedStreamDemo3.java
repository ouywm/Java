package com.itheima.stream.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo3 {
	/*
		字节缓冲流，写出数据的过程
	 */

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\D.txt"));

		for (int i = 1; i <= 8192; i++){
			bos.write(97);
		}

		bos.close();
	}
}
