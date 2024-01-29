package com.itheima.stream.iotest;


import com.itheima.stream.iotest.domain.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test8 {
	/*
		txt文件中实现准备好一些学生信息，每个学生的信息独占一行
		要求1：每次被点到的学生，再次被点到的概率的原先基础上降低一半
		举例：80个学生点名5次，每次都点到小A，概率变化如下
		第一次每人概率:1.25%
		第二次小A概率:0.625%            其他学生概率:1.2579%
		第三次小A概率:0.3125%           其他学生概率:1.261867%
		第四次小A概率:0.15625%          其他学生概率:1.2638449%
		第五次小A概率:0.078125          其他学生概率:1.26483386%


		提示：本题的核心就是带权重的随机
	 */
	public static void main(String[] args) throws IOException {
		// 创建字符缓冲流，读取文件中的数据
		BufferedReader br = new BufferedReader(new FileReader("D:\\Codes\\Codes\\Advanced-Code\\day13-code\\src\\com\\itheima\\stream\\iotest\\A.txt"));
		// 创建集合用来存放读取的学生信息对象
		ArrayList<Student> list = new ArrayList<>();
		// 读取的行
		String line;
		// 开始读取
		while ((line = br.readLine()) != null) {
			// 按照“-”切割
			String[] arr = line.split("-");
			// 切割好的数据，来创建对象，0号索引是名字，1号索引是性别，2号索引是年龄，3号索引是权重
			Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
			// 创建好的对象，添加到集合中
			list.add(stu);
		}
		// 关流
		br.close();
		// 定义总权重变量
		double weight = 0;
		// 遍历集合，获取集合中每一个学生对象
		for (int i = 0; i < list.size(); i++) {
			// 获取每一个学生对象
			Student stu = list.get(i);
			// 计算总和
			weight += stu.getWeight();
		}
		// 计算每一个学生的实际占比
		// 创建小数数组，用来装权重
		double[] arr = new double[list.size()];
		// 遍历集合，获取每一个学生对象
		for (int i = 0; i < list.size(); i++) {
			// 获取到每一个学生对象
			Student stu = list.get(i);
			// 拿学生对象调用getWeight方法，获取权重，赋值给arr权重数组
			arr[i] = stu.getWeight() / weight;
		}
		// 计算每个同学的权重占比范围
		// 就是前面的一个和自己相加就获取到了，第一位不做处理，因为就是0
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		// 随机抽取同学
		// 获取一个0.0~1.0之间的随机数
		double number = Math.random();
		// 判断number在arr数组中的位置
		// 使用二分查找
		int result = -Arrays.binarySearch(arr, number) - 1;
		Student stu = list.get(result);
		// 修改当前被点到学生的权重
		double w = stu.getWeight() / 2;
		stu.setWeight(w);
		System.out.println(stu);
		// 把集合中的数据再次写到文件中，因为已经修改了权重
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Codes\\Codes\\Advanced-Code\\day13-code\\src\\com\\itheima\\stream\\iotest\\A.txt"));
		for (Student s : list) {
			bw.write(s.toString());
			bw.newLine();
		}
		bw.close();
	}
}
