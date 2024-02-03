package com.itheima.waitandnotify1;

public class Foodie extends Thread {
	/**
	 * 1.循环
	 * 2.同步代码块
	 * 3.判断共享数据是否到了末尾(到了末尾)
	 * 3.判断共享数据是否到了末尾(没有到末尾，执行核心逻辑)
	 */
	@Override
	public void run() {

		// 循环
		while (true) {
			// 同步代码块
			synchronized (Desk.lock) {
				// 判断共享数据是否到了末尾(到了末尾)
				if (Desk.count == 0) {
					break;
				} else {
					// 先判断桌上有没有面条
					if (Desk.foodFlag == 0) {
						// 没有面条就等待
						try {
							// 让当前线程跟锁进行绑定
							Desk.lock.wait();
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					} else {
						// 要吃的面条总数减一
						Desk.count--;
						// 打印正在吃面条
						System.out.println("吃货正在吃面条，还能再吃" + Desk.count + "碗");
						// 吃完面条改变桌子状态
						Desk.foodFlag = 0;
						// 唤醒厨师继续做面条
						Desk.lock.notifyAll();
					}
				}
			}
		}
	}
}
