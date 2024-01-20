package com.itheima.stream.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
	/*
		压缩文件夹与文件保持层级关系
	 */
	public static void main(String[] args) throws IOException {

		// 创建File对象，要压缩的文件
		File src = new File("D:\\test");
		// 创建File对象表示压缩包放在哪(要锁奥的父级路径)
		File destParentFile = src.getParentFile();
		// 创建File对象，压缩文件放在哪里
		File dest = new File(destParentFile, src.getName());
		// 创建压缩流关联压缩包
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

		toZip(src, zos, src.getName());
	}

	/**
	 * 作用：获取src里面每一个文件，变成ZipEntry对象，放到压缩包中
	 * 参数一：数据源
	 * 参数二：压缩流
	 * 参数三：压缩包内部路径
	 */
	private static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
		// 进入src文件夹
		File[] files = src.listFiles();
		// 遍历数组，得到每一个
		for (File file : files) {
			if (file.isFile()) {
				// 判断文件，是-文件，变成ZipEntry对象，放入到压缩包中
				ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
				zos.putNextEntry(entry);
				// 读取文件中的数据，写到压缩包
				FileInputStream fis = new FileInputStream(file);
				int i;
				while ((i = fis.read()) != -1) {
					zos.write(i);
				}
				fis.close();
				zos.closeEntry();
			} else {
				toZip(file, zos, name + "\\" + file.getName());
			}
		}
	}
}
