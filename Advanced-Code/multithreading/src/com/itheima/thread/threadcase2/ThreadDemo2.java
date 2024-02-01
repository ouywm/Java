package com.itheima.thread.threadcase2;

public class ThreadDemo2 {
	/**
	 * 多线程的第二种启动方式：
	 * 1.自己定义一个类，实现Runnable接口
	 * 2.重写里面的Run方法
	 * 3.创建自己这个类的对象
	 * 4.创建一个Thread类的对象，并开启线程
	 */
	public static void main(String[] args) {

		// 创建MyRun对象
		// 表示多线程要执行的任务
		MyRun mr = new MyRun();

		// 创建线程对象
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);

		// 设置名字
		t1.setName("线程1");
		t2.setName("线程2");

		// 开启线程
		t1.start();
		t2.start();


	}
}
