package com.itheima.file;

import java.io.File;

public class FileTest4 {
	/*
		需求: 键盘录入一个文件夹路径，统计文件夹的大小
	 */
	public static void main(String[] args) {

		File dir = FileTest1.getDir();

		System.out.println(getLength(dir));

	}

	public static long getLength(File dir) {
		// 文件大小变量
		long sum = 0;
		File[] files = dir.listFiles();
		// 遍历文件路径
		for (File file : files) {
			// 判断是不是文件
			if (file.isFile()) {
				// 是文件就直接获取文件大小，然后跟sum做+=
				sum += file.length();
			} else { // 否则就是文件夹呗，这个文件夹不等于空才递归
				if (file.listFiles() != null) {
					// 做递归，返回值跟sum+=
					sum += getLength(file);
				}
			}
		}
		// 把文件大小返回
		return sum;
	}
}