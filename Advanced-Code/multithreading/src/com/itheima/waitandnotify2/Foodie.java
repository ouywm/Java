package com.itheima.waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

	ArrayBlockingQueue<String> queue;

	public Foodie(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {

		// 不断地从阻塞队列中获取面条
		while(true){
			try {
				String food = queue.take();
				System.out.println(food);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}
}
