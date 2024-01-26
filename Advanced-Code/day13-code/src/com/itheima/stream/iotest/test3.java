package com.itheima.stream.iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class test3 {
	/*
		需求：
			有一个文件里面存储了班级同学的信息，每一个信息独占一行
			格式为：张三-男-23
			要求通过程序实现随机点名

		运行效果：
			第一次运行程序：随机同学姓名1(只显示名字)
			第二次运行程序：随机同学姓名2(只显示名字)
			第三次运行程序：随机同学姓名3(只显示名字)
	 */

	public static void main(String[] args) throws IOException {


		// 读取文件中学生的姓名
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();

		Collections.shuffle(list);
		String randomName2 = list.get(0);
		String[] arr = randomName2.split("-");
		System.out.println(arr[0]);
	}
}
