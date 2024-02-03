package com.itheima.waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
	/**
	 * 需求：利用阻塞队列完成生产者和消费者(等待唤醒机制)的代码
	 * 细节：
	 * 生产者和消费者必须使用同一个阻塞队列
	 */
	public static void main(String[] args) {

		// 创建阻塞队列对象
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

		// 创建线程对象
		cook c = new cook(queue);
		Foodie f = new Foodie(queue);

		// 启动线程
		c.start();
		f.start();


	}
}
