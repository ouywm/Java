package com.itheima.stream.iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test5 {
	/*
		需求：一个文件里面存储了班级同学的信息，每一个学生信息占一行
			格式为：张三-男-23
			要求通过程序实现随机点名器

		运行效果：
			70%的概率随机到男生
			30%的概率随机到女生
			总共随机100万次，统计结果
			注意观察：看男生和女生的比例是不是接近于7:3

	 */

	public static void main(String[] args) throws IOException {
		// 使用字符缓冲读取流读取数据
		BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
		// 准备集合用来存储男学生信息
		ArrayList<String> boyNameList = new ArrayList<>();
		// 准备集合用来存储男学生信息
		ArrayList<String> girlNameList = new ArrayList<>();
		// 定义男孩变量
		int boyCount = 0;
		// 定义女孩变量
		int girlCount = 0;

		String line;
		// 读取数据
		while ((line = br.readLine()) != null) {
			String[] arr = line.split("-");
			if (arr[1].equals("男")) {
				boyNameList.add(line);
			} else {
				girlNameList.add(line);
			}
		}
		br.close();

		// 定义权重集合
		ArrayList<Integer> list = new ArrayList<>();
		// 添加比例
		Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
		// 随机数
		Random r = new Random();
		// 循环一百万次
		for (int i = 0; i < 10000; i++) {
			// 从权重集合中获取随机数据
			int index = r.nextInt(list.size());
			int weight = list.get(index);
			// 判断随机数是一还是零
			if (weight == 1) {
				// 是一就是男生
				boyCount++;
				// 就随机男生
				Collections.shuffle(boyNameList);
				String boyInfo = boyNameList.get(0);
//				System.out.println(boyInfo);
			} else {
				// 否之就是女生
				girlCount++;
				// 随机女生
				Collections.shuffle(girlNameList);
				String girlInfo = girlNameList.get(0);
//				System.out.println(girlInfo);
			}
		}
		System.out.println("随机抽取100万次，其中男生被抽到了" + boyCount);
		System.out.println("随机抽取100万次，其中女生被抽到了" + girlCount);
	}
}
