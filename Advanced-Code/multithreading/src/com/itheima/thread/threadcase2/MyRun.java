package com.itheima.thread.threadcase2;

public class MyRun implements Runnable {
	@Override
	public void run() {


		for (int i = 0; i < 100; i++) {
			// 书写线程要执行的代码
			// 获取当前线程对象
			System.out.println(Thread.currentThread().getName() + ":hello world");
		}
	}
}
