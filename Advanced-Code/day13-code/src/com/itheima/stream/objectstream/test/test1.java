package com.itheima.stream.objectstream.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test1 {
	public static void main(String[] args) throws IOException {

		// 创建序列化对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\D.txt"));


		// 创建集合，用来装学生对象
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("张三", 23, "广东"));
		list.add(new Student("李四", 24, "福建"));
		list.add(new Student("王五", 25, "上海"));

		oos.writeObject(list);

		oos.close();

	}


	/**
	 * 老方法
	 */
	private static void methodOld() throws IOException {
		// 创建序列化流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\D.txt"));

		// 创建学生对象
		// 这样一次性写入多个对象，在反序列化(读取)的时候，不知道要读取多少个对象啊！！
		// 所以不好
		Student stu1 = new Student("张三", 23, "广东");
		Student stu2 = new Student("李四", 24, "福建");
		Student stu3 = new Student("王五", 25, "上海");
		// 写入对象
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.writeObject(stu3);

		// 关流
		oos.close();
	}
}
