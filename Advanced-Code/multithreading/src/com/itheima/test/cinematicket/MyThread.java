package com.itheima.test.cinematicket;

public class MyThread extends Thread {
	// 总票数
	static int ticket = 1000;
	// 已经卖出的票数
	static int i = 0;
	@Override
	public void run() {


		while (true) {
			synchronized (com.itheima.threadsafe.MyThread.class) {
				if (ticket == 0) {
					break;
				} else {
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					ticket--;
					i++;
					System.out.println(getName() + "卖出" + i + "张票" + ",还剩" + ticket + "张票");
				}
			}
		}

	}
}
