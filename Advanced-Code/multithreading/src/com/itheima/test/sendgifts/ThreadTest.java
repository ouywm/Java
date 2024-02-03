package com.itheima.test.sendgifts;

public class ThreadTest {
	/**
	 * 有100分礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出
	 * 利用多线程模拟该过程并将线程和礼物剩余数量打印出来
	 */
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.setName("小李");
		t2.setName("小王");


		t1.start();
		t2.start();
	}
}
