package com.itheima.thread.method3;

public class ThreadDemo3 {
	/*
		final void setDaemon(boolean on)      设置为守护线程

                   细节：当其他的非守护线程执行完毕之后，守护线程会陆陆续续结束

	               通俗来讲：
	                    当女神线程结束了，备胎线程也没有存在的必要了
	 */
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();

		t1.setName("女神");
		t2.setName("备胎");

		// 把第二个线程设置为守护线程(备胎线程)
		t2.setDaemon(true);

		t1.start();
		t2.start();
	}
}
