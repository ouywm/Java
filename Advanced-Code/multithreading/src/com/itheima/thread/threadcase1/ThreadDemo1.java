package com.itheima.thread.threadcase1;

public class ThreadDemo1 {
	/**
	 *  多线程的第一种启动方式：
	 *      1.自己定义一个类，继承Thread类
	 *      2.重写run方法
	 *      3.创建子类对象，并启动线程
	 */
	public static void main(String[] args) {

		// 创建子类对象
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		// 给线程起名字
		t1.setName("线程1");
		t2.setName("线程2");

		// 启动线程(开启线程)
		t1.start();
		t2.start();

	}
}
