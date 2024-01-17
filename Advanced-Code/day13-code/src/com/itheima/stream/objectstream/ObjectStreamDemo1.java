package com.itheima.stream.objectstream;

import java.io.*;

public class ObjectStreamDemo1 {
	/*
		需求
			利用序列化流/对象操作输出流，把每一个对象写到本地文件中

		构造方法
			public ObjectOutStream(ObjectStream out) : 把基本流变成高级流

	    成员方法
	        public final void writeObject(Object obj)   : 把对象序列化(写出)到文件中
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 创建学生对象
		Student stu = new Student("张三", 23,"北京");

		// 创建序列化流对象(对象操作输出流)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\C.txt"));


		// 写出数据
		oos.writeObject(stu);


		// 释放资源
		oos.close();

	}
}
