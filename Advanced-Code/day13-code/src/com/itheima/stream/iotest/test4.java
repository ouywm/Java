package com.itheima.stream.iotest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test4 {
	/*
		需求：
			一个文件里面存储了班级同学的姓名，每一行占一行
			要求通过程序实现随机点名器
			第三次一定是张三同学


			运行效果：
				第一次运行程序：随机同学姓名1
				第一次运行程序：随机同学姓名2
				第一次运行程序：张三
	 */
	public static void main(String[] args) throws IOException {

		// 创建集合，用来装学生信息
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\b.txt"));
		// 定义次数变量
		int count;
		// 因为次数文件中只有一行，不用循环读取，这里直接赋值给count次数变量
		count = Integer.parseInt(br1.readLine());
		br1.close();

		// 运行一次自增
		count++;

		// 开始读取学生信息
		BufferedReader br2 = new BufferedReader(new FileReader("D:\\a.txt"));
		// 读到的每一行
		String line;
		while ((line = br2.readLine()) != null) {
			// 把每一个学生信息添加到集合中
			list.add(line);
		}
		br2.close();
		// 判断次数
		if (count > 3 || count == 3) {
			// 大于或者等于三
			System.out.println("张三");
		} else {// 这就是比三小
			// 打乱顺序，洗牌
			Collections.shuffle(list);
			// 根据索引获取元素，因为已经洗牌(打乱顺序)，所以获取第一个元素就行
			String str = list.get(0);
			// 做切割，根据“-”做分割
			String[] arr = str.split("-");
			// 获取零号索引，是名字
			System.out.println(arr[0]);
		}

		// 最后写出次数
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\b.txt"));
		bw.write(count + "");
		bw.close();
	}
}
