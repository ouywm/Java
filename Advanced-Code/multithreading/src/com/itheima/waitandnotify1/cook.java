package com.itheima.waitandnotify1;

public class cook extends Thread {
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
					// 到了就不做面条了
					break;
				} else {
					// 判断桌上是否有食物
					if (Desk.foodFlag == 1) {
						try {
							// 有就等待
							Desk.lock.wait();
						} catch (InterruptedException e) {
							throw new RuntimeException(e);
						}
					} else {
						// 没有就做面条
						System.out.println("厨师正在做面条 ");
						// 修改桌上状态，已经有面条了
						Desk.foodFlag = 1;
						// 唤醒所有线程，叫醒吃货开吃
						Desk.lock.notifyAll();
					}
				}
			}
		}
	}
}
