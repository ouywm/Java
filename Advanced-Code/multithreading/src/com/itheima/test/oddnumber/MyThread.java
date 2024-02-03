package com.itheima.test.oddnumber;

public class MyThread extends Thread {

	static int i = 0;

	@Override
	public void run() {

		while (true) {
			synchronized (MyThread.class) {
				if (i == 100) {
					break;
				} else {
					i++;
					if (i % 2 != 0) {
						System.out.println(getName() + ":" + i);
					}
				}
			}
		}

	}
}
