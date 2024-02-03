package com.itheima.waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class cook extends Thread {

	ArrayBlockingQueue<String> queue;

	public cook(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		// 不断地把面条放到阻塞队列
		while (true) {
			try {
				queue.put("面条");
				System.out.println("厨师放了一碗面条");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}

	}
}
