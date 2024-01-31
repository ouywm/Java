package com.itheima.stream.properties;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象，这个类并不是泛型类，所以没有泛型
		Properties prop = new Properties();
		// 添加数据
		// 虽然是没有泛型，可以添加任意的数据类型，不过一般添加数据的时候不会添加任意类型的数据
		// 只会添加字符串类型的数据
		prop.put("aaa", "111");
		prop.put("bbb", "222");
		prop.put("ccc", "333");

		// 字节输出流
		FileOutputStream fos = new FileOutputStream(new File("D:\\Codes\\Codes\\Advanced-Code\\Properties.properties"));
		prop.store(fos, "test");
		fos.close();

	}

	private static void method(Properties prop) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Codes\\Codes\\Advanced-Code\\Properties.properties"));
		Set<Map.Entry<Object, Object>> entries = prop.entrySet();
		for (Map.Entry<Object, Object> entry : entries) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			bw.write(key + "=" + value);
			bw.newLine();
		}
		bw.close();
	}
}
