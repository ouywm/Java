package com.itheima.test.sendgifts;

public class MyThread extends Thread {

	// 礼物总数
	static int gifts = 100;

	@Override
	public void run() {

		while (true) {
			synchronized (MyThread.class) {
				if (gifts <= 10) {
					break;
				} else {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					gifts--;
					System.out.println(getName() + "送出礼物，还剩" + gifts + "份礼物");
				}
			}
		}
	}
}
