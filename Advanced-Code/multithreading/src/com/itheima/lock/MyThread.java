package com.itheima.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

	static int ticket = 0;

	static Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// 循环
		while(true){
			lock.lock();
			try {
				// 判断
				if(ticket == 100){
					break;
				}else {
					Thread.sleep(50);
					// 判断
					ticket++;
					System.out.println(getName() + "正在卖第" + ticket + "张票");
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				lock.unlock();
			}
		}
	}
}
