package com.itheima.threadsafe;

/*
		代码块锁
		就是把要执行的代码锁起来了，锥段代码逻辑，只能有一个线程进入
		这个线程把代码运行完毕，出去之后，其他线程才能运行
		即使抢到了代码执行权，因为加了锁，还是要等线程出来
 */
public class MyThread extends Thread {

	// 表示这个类的所有对象，都共享ticket这个变量
	static int ticket = 0;

	// 锁对象，一定要是唯一的
	//static Object obj = new Object();
	@Override
	public void run() {

		while (true) {
			// 同步代码块
			synchronized (MyThread.class) {
				if (ticket < 100) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					ticket++;
					System.out.println(getName() + "正在卖第" + ticket + "张票");
				} else {
					break;
				}
			}
		}
	}
}
