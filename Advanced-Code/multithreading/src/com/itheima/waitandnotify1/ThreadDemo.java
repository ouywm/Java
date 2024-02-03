package com.itheima.waitandnotify1;

public class ThreadDemo {
	/**
	 * 需求：完成生产者和消费者(等待唤醒机制)的代码实现线程轮流交替执行的效果
	 */
	public static void main(String[] args) throws InterruptedException {

		// 创建线程对象
		cook c = new cook();
		Foodie f = new Foodie();

		c.setName("厨师");
		f.setName("吃货");

		// 开启线程
		f.start();
		c.start();

	}
}
