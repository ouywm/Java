package com.itheima.threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	/*
		public static ExecutorService newCachedThreadPool()   创建一个没有上线的线程池
		public static ExecutorService new FixedThreadPool()   创建一个有上限的线程池
	 */
	public static void main(String[] args) throws InterruptedException {


		// 创建线程池对象
		ExecutorService pool1 = Executors.newFixedThreadPool(3);

		// 提交任务
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());

		// 销毁线程
		// pool1.shutdown();
	}

	private static void method() throws InterruptedException {
		// 创建线程池对象
		ExecutorService pool1 = Executors.newCachedThreadPool();

		// 提交任务
		pool1.submit(new MyRunnable());
		Thread.sleep(1000);
		pool1.submit(new MyRunnable());
		Thread.sleep(1000);
		pool1.submit(new MyRunnable());
		Thread.sleep(1000);
		pool1.submit(new MyRunnable());
		Thread.sleep(1000);
		pool1.submit(new MyRunnable());

		// 销毁线程
		// pool1.shutdown();
	}
}
