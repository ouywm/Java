package com.itheima.stream.test;

import java.io.*;

public class CopyDirTest {
	/*
		拷贝一个文件夹, 考虑子文件夹

		将D:\\test文件夹, 拷贝到E:\\
	 */
	public static void main(String[] args) throws IOException {
		// 源文件所在路径
		File src = new File("D:\\test");
		// 要拷贝到的目的地
		File dest = new File("C:\\");

		copyDir(src, dest);


	}

	public static void copyDir(File src, File dest) throws IOException {
		// 封装File对象，根据传入的父级路径跟子级路径封装，dest是父级路径，src.getName是子级路径,
		// 子级路径就是去获取他文件名，作为子级路径
		File newDir = new File(dest, src.getName());
		// 创建文件夹
		newDir.mkdirs();
		// 从数据源中获取数据(File对象)
		File[] files = src.listFiles();
		// 遍历数组，获取每一个文件或文件夹对象
		for (File file : files) {
			// 判断当前对象是否是文件
			if (file.isFile()) {
				// 是的话直接拷贝
				// file 表示当前文件
				FileInputStream fis = new FileInputStream(file);
				// newDir表示父级路径，file是当前文件，获取他的名字，作为子级路径
				FileOutputStream fos = new FileOutputStream(new File(newDir, file.getName()));
				int len;
				byte[] bys = new byte[1024];
				while ((len = fis.read(bys)) != -1) {
					fos.write(bys, 0, len);
				}
				fis.close();
				fos.close();
			} else {
				// 如果是文件夹，递归调用方法
				copyDir(file, newDir);
			}
		}
	}
}