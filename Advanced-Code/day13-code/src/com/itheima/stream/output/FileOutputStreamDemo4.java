package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
	/*
		IO流的异常处理.jdk7版本开始
	 */
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("D:\\B.txt");) {
			fos.write("abc".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (Demo d = new Demo();) {

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Demo implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("我关闭了喔");
	}
}