package com.itheima.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest1 {
	/*
		将D:\\区.png 拷贝到C:\ 根目录下

		分析：

				1.创建输入流对象读取文件
				2.创建输出流对象关联数据目的
				3.读写操作
				4.关闭流释放资源
	 */
	
	public static void main(String[] args) throws IOException {
		// 1.创建输入流对象读取文件
		FileInputStream fis = new FileInputStream("D:\\区.png");
		// 2.创建输出流对象关联数据目的
		FileOutputStream fos = new FileOutputStream("D:\\image\\区.png");
		// 3.创建输出流对象关联数据目的
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fis.close();
		fos.close();

	}
}