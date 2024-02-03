package com.itheima.test.prizepoolcase2.prizepoolcase1;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest {
	/**
	 * 在上一题的基础上继续完成如下需求
	 * 每次抽奖的过程中，不答应，抽完是一次性打印(随机)
	 * 在此次抽奖过程中，抽奖箱1总共产生了6个奖项
	 * 分别是：10,20,100,500,2,300最高奖项为300元，总金额为932元
	 * 在此次抽奖过程中，抽奖箱2总共产生了6个奖项
	 * 分别是：5，50,200,800,80,700,最高奖项为800元，总金额为1835元
		 */
	public static void main(String[] args) {

		// 创建奖池集合
		ArrayList<Integer> list = new ArrayList<>();
		// 往奖池集合添加数据
		Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

		// 创建线程对象
		MyThread t1 = new MyThread(list);
		MyThread t2 = new MyThread(list);

		// 给线程对象起名字
		t1.setName("抽奖箱1");
		t2.setName("抽奖箱2");

		// 启动线程
		t1.start();
		t2.start();
	}
}
