package com.itheima.file;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("D:\\");
		File[] files = f.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
