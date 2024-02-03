package com.itheima.test.prizepoolcase2.prizepoolcase1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

	ArrayList<Integer> list;

	// 线程1
	static ArrayList<Integer> list1 = new ArrayList<>();

	// 线程2
	static ArrayList<Integer> list2 = new ArrayList<>();


	public MyThread(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {

		// 循环
		while (true) {
			// 同步代码块
			synchronized (MyThread.class) {
				// 判断是否到了末尾(已经到了)
				if (list.isEmpty()) {
					if ("抽奖箱1".equals(getName())) {
						// 是线程一
//						// 线程一里面个元素个数
//						int count1 = list1.size();
//						// 线程1总金额
//						int sum1 = 0;
//						System.out.println("在此次抽奖过程中，" + getName() + "总共产生了" + count1 + "个奖项");
//						int price1 = 0;
//						System.out.print("分别是:");
//						for (int i = 0; i < list1.size(); i++) {
//							sum1 += list1.get(i);
//							price1 = list1.get(i);
//							System.out.print(price1 + ",");
//						}
//						System.out.println("\r\n总金额:" + sum1);
						getList(list1);

					} else if ("抽奖箱2".equals(getName())) {
						// 是线程二
//						// 线程二里面个元素个数
//						int count2 = list2.size();
//						// 线程2总金额
//						int sum2 = 0;
//						// 是线程一
//						System.out.println("在此次抽奖过程中，" + getName() + "总共产生了" + count2 + "个奖项");
//						int price2 = 0;
//						System.out.print("分别是:");
//						for (int i = 0; i < list2.size(); i++) {
//							sum2 += list2.get(i);
//							price2 = list2.get(i);
//							System.out.print(price2 + ",");
//						}
//						System.out.println("\r\n总金额:" + sum2);
						getList(list2);
					}
					break;
				} else {
					// 判断是否到了末尾(没到)
					// 打乱集合
					Collections.shuffle(list);
					// 删除0号索引元素，并将删除的元素做接收
					Integer price = list.remove(0);
					// 判断是哪个线程执行
					if ("抽奖箱1".equals(getName())) {
						// 是线程一，就把数据添加到线程1集合
						list1.add(price);
					} else if ("抽奖箱2".equals(getName())) {
						// 是线程二，就把数据添加到线程2集合
						list2.add(price);
					}
				}
			}
			// 休眠10毫秒，让出cpu执行权
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private void getList(ArrayList<Integer> list) {
		// 获取集合中的元素个数
		int count = list.size();
		// 求总和变量
		int sum = 0;
		// 每一个金额
		int price = 0;

		System.out.println("在此次抽奖过程中，" + getName() + "总共产生了" + count + "个奖项");
		System.out.print("分别是:");
		// 遍历集合求总和
		for (int i = 0; i < list.size() - 1; i++) {
			price = list.get(i);
			sum += price;
			System.out.print(price + ",");
		}
		System.out.print(list.get(list.size() - 1));
		System.out.println("\r\n总金额:" + sum);
	}
}
