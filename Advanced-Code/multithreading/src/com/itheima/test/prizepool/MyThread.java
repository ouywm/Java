package com.itheima.test.prizepool;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

	ArrayList<Integer> list;


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
					break;
				} else {
					// 判断是否到了末尾(没到)
					// 打乱集合
					Collections.shuffle(list);
					// 删除0号索引元素，并将删除的元素做接收
					Integer price = list.remove(0);
					System.out.println(getName() + "又产生了一个" + price + "元大奖");
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
}
