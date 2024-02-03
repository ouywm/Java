package com.itheima.threadsafemethod;

public class threadDemo {
	/*
		需求：
				某电影院正在上映国产大片，共有100张票，而他有三个窗口，请设计一个程序模拟该电影院卖票
	 */
	public static void main(String[] args) {

		// 创建任务赌侠你给
		MyRunnable mr = new MyRunnable();

		// 创建线程对象
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);

		// 设置名字
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		// 开启线程
		t1.start();
		t2.start();
		t3.start();
	}
}
