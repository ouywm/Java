package com.itheima.stream.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		Properties prop = new Properties();
		// 创建字节输入流
		FileInputStream fos = new FileInputStream("D:\\Codes\\Codes\\Advanced-Code\\Properties.properties");
		// 读取
		prop.load(fos);
		// 关流
		fos.close();

		System.out.println(prop);
	}
}
