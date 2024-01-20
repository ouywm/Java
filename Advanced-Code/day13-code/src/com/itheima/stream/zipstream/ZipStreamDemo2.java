package com.itheima.stream.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
	/*
		压缩流
			需求：
				把D:\\a.txt打包成一个压缩包
	 */
	public static void main(String[] args) {
		// 创建File对象，要压缩的文件
		File src = new File("D:\\a.txt");
		// 创建File对象，压缩之后放哪里
		File dest = new File("D:\\");
	}

	public static void toZip(File src, File dest) throws IOException {
		// 创建压缩流关联文件
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
		// 创建ZipEntry对象，表示压缩包中的每一个文件或者文件夹
		ZipEntry entry = new ZipEntry("a.txt");
		// 把entry对象放到压缩包中
		zos.putNextEntry(entry);
		// 把src文件中的数据写到压缩包中
		FileInputStream fis = new FileInputStream(src);
		int i;
		while ((i = fis.read()) != -1) {
			zos.write(i);
		}
		zos.closeEntry();
		fis.close();
	}
}
