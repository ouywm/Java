package com.itheima.threadsafe;

public class threadDemo {
	/*
		需求：
				某电影院正在上映国产大片，共有100张票，而他有三个窗口，请设计一个程序模拟该电影院卖票
	 */
	public static void main(String[] args) {


		// 创建线程对象
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		// 给线程器名字
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();

	}
}
