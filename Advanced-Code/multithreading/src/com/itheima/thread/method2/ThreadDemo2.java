package com.itheima.thread.method2;

public class ThreadDemo2 {
	/*
		setPriority(int newPriority)              设置线程优先级
				优先级不是绝对的
		final int getPriority()                   获取线程优先级
	 */
	public static void main(String[] args) {

		// 创建线程要执行的参数对象
		MyRunnable mr =  new MyRunnable();


		// 创建线程对象
		Thread t1 = new Thread(mr,"test1");
		Thread t2 = new Thread(mr,"test2");

		// 获取优先级，打印出来
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		// 设置优先级
		t1.setPriority(1);
		t2.setPriority(1);

		t1.start();
		t2.start();
	}
}
