package com.itheima.thread.method1;

public class MyThread1 extends Thread {
	public MyThread1() {
	}

	public MyThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(getName() + "@" + i);
		}
	}
}
