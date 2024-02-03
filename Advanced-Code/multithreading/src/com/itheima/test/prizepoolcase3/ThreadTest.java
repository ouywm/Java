package com.itheima.test.prizepoolcase3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	/**
	 * 在上一题的基础上继续完成如下需求
	 * 每次抽奖的过程中，不答应，抽完是一次性打印(随机)
	 * 在此次抽奖过程中，抽奖箱1总共产生了6个奖项
	 * 分别是：10,20,100,500,2,300最高奖项为300元，总金额为932元
	 * 在此次抽奖过程中，抽奖箱2总共产生了6个奖项
	 * 分别是：5，50,200,800,80,700,最高奖项为800元，总金额为1835元
	 */
	public static void main(String[] args) throws ExecutionException, InterruptedException {

		// 创建奖池集合
		ArrayList<Integer> list = new ArrayList<>();
		// 往奖池集合添加数据
		Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

		// 创建线程要执行的任务对象
		MyCallable mc1 = new MyCallable(list);
		MyCallable mc2 = new MyCallable(list);

		// 创建多线程运行结果的管理者对象
		// 线程一
		FutureTask<Integer> ft1 = new FutureTask<>(mc1);
		FutureTask<Integer> ft2 = new FutureTask<>(mc2);

		// 创建线程对象
		Thread t1 = new Thread(ft1);
		Thread t2 = new Thread(ft2);

		// 线程对象起名字
		t1.setName("抽奖箱1");
		t2.setName("抽奖箱2");

		// 开启线程
		t1.start();
		t2.start();

		// 获取线程执行返回结果
		Integer max1 = ft1.get();
		Integer max2 = ft2.get();

		System.out.println("抽奖箱1 " + max1);
		System.out.println("抽奖箱2 " + max2);

		// 在此次抽奖过程中，抽奖箱2产生了最大奖项，该金额为800元
		if (max1 > max2) {
			System.out.println("在此次抽奖过程中，抽奖箱1产生了最大奖项，该金额为" + max1 + "元");
		} else {
			System.out.println("在此次抽奖过程中，抽奖箱2产生了最大奖项，该金额为" + max2 + "元");
		}
	}
}


