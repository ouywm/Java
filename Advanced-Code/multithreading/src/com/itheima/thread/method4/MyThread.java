package com.itheima.thread.method4;

public class MyThread extends Thread {


	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName() + "@" + i);
			// 表示让出当前CPU的执行权，尽可能的均匀
			Thread.yield();
		}
	}
}
