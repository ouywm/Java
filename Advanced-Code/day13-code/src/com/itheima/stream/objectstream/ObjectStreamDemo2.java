package com.itheima.stream.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
	/*
		需求
			利用反序列化流/对象操作输入流，把文件中的对象读取到程序中
		构造方法
			public ObjectInputStream(InputStream out) 把基本流变成高级流
		成员方法
			public Object readObject()  读取本地文件中的对象，读取到程序中
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 创建反序列化流对象
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("D:\\c.txt"));

		// 读取
		Object stu = ios.readObject();

		// 打印
		System.out.println(stu);

		// 关流
		ios.close();

	}
}
