package com.itheima.thread.method4;

public class ThreadDemo3 {
	/*
		public static void yield()                   礼让线程
	 */
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();


		t1.setName("飞机");
		t2.setName("坦克");

		t1.start();
		t2.start();
	}
}
