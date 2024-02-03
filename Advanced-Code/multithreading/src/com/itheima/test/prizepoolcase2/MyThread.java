package com.itheima.test.prizepoolcase2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

	ArrayList<Integer> list;

	/*
		下面这样的写法特别臃肿，难道我创建100条线程，写100个集合？
		不可能的啊
		所以改进
	 */
	// 线程1
//	static ArrayList<Integer> list1 = new ArrayList<>();
//
//	// 线程2
//	static ArrayList<Integer> list2 = new ArrayList<>();


	public MyThread(ArrayList<Integer> list) {
		this.list = list;
	}

	// 哪个线程抢到cpu的执行权，就会来执行run方法
	// 线程有属于自己的独立栈，哪个线程执行，就会在自己的栈里面创建这个属于自己线程的

	@Override
	public void run() {
		ArrayList<Integer> boxList = new ArrayList<>();
		// 循环
		while (true) {
			// 同步代码块
			synchronized (MyThread.class) {
				// 判断是否到了末尾(已经到了)
				if (list.isEmpty()) {
					getList(boxList);
//					System.out.println(getName() + boxList);
					break;
				} else {
					// 判断是否到了末尾(没到)
					// 打乱集合
					Collections.shuffle(list);
					// 删除0号索引元素，并将删除的元素做接收
					Integer price = list.remove(0);
					boxList.add(price);
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
		for (int i = 0; i < list.size(); i++) {
			price = list.get(i);
			sum += price;
			System.out.print(price + " ");
		}
		System.out.println("\r\n总金额:" + sum);
	}
}
