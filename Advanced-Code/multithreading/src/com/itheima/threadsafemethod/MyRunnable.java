package com.itheima.threadsafemethod;


public class MyRunnable implements Runnable {

	int ticket = 0;

	@Override
	public void run() {
		// 循环
		while (true) {
			// 同步代码块(同步方法)
			if (method()) break;
		}
	}

	private synchronized boolean method() {
		// 判断数据是否达到了末尾，如果到了末尾
		if (ticket == 100) {
			return true;
		} else {
			// 判断数据是否到了末尾，如果没有到末尾
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			ticket++;
			System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
		}
		return false;
	}
}
