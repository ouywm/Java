package com.itheima.test.oddnumber;

public class ThreadTest {
	/**
	 * 同时开启两个线程，共同获取1-100之间的所有数字
	 * 要求输出所有的奇数
	 */
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();


		t1.setName("线程A");
		t2.setName("线程B");

		t1.start();
		t2.start();
	}
}
