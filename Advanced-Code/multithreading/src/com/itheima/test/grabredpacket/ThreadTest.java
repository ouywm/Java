package com.itheima.test.grabredpacket;

public class ThreadTest {
	/**
	 * 抢红包也用到多线程
	 * 假设：100块，根成了三个包，现在有5个人去抢
	 * 其中红包是共享数据
	 * 5个人是5条线程
	 * <p>
	 * 打印结果如下：
	 * xxx抢到了xxx元
	 * xxx抢到了xxx元
	 * xxx抢到了xxx元
	 * xxx没有抢到
	 * xxx没有抢到
	 */
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();

		t1.setName("小A");
		t2.setName("小B");
		t3.setName("小C");
		t4.setName("小D");
		t5.setName("小E");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
