package com.itheima.stream.buffer;

import java.io.*;

public class BufferedStreamDemo1 {
	/*
		字节缓冲输入流 ： public BufferedInputStream(InputStream in)
		字节缓冲输出流 : public BufferedOutputStream(OutputStream out)
		提高效率，为啥？
		因为默认创建一个数组

		字节缓冲流读写过程
			在创建对象的时候，会调用构造方法，这个时候就在初始化了，会初始化一个8192大小的一个数组，然后读取，一次性读取8192个字节，将内置数组装满

		字节缓冲输出过程
			会等待什么时候把8192大小数组装满，就会一次性全部写出去,装满了，才会往外倒，然后准备接新的，不是直接写到文件，而是先写到内置数组当中，要是数据没有8192个，
			关闭了流，数据会写出去，因为在调close方法的时候，会检查缓冲区里面有没有数据，有数据刷出去，在关闭

	 */
	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();

		FileInputStream fis = new FileInputStream("D:\\区.png");


		FileOutputStream fos = new FileOutputStream("D:\\image\\区.png");
		int len;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);

		fis.close();
		fos.close();

	}

	private static void method() throws IOException {
		// 1.创建字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\区.png"));

		// 2.创建字节缓冲输出流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\image\\区.png"));
		// 读写操作
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		// 关流
		bis.close();
		bos.close();
	}
}
