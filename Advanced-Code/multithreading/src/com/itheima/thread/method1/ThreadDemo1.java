package com.itheima.thread.method1;

public class ThreadDemo1 {
	/*
		String getName()                     返回次线程的名称
				如果没有给线程设置名字，那么他也是有默认值名字的
						格式：Thread-X(X:序号，从开始)

		void setName(String name)            设置线程的名名称
				如果我们要给线程设置名字可以用set方法，也可以用构造方法进行设置

		static Thread currentThread()        获取当前的对象
				当JVM虚拟机启动之后，会自动的启动多条多线程
				其中一条线程就叫做main线程
				他就是去调用main方法，并执行里面的方法
				在以前，我们写的所有代码，其实都是运行在main线程中的

		static void sleep(long time)         让线程休眠指定的时间，单位为毫秒
				哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
				方法的参数，就代表睡眠的时间，单位毫秒
				1 秒 = 1000毫秒
				当时间到了之后，线程会自动的醒来，继续执行下面的代码
	 */
	public static void main(String[] args) {

		method1();

	}

	private static void method2() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
	}

	private static void method1() {
		// 创建线程对象
		MyThread1 t1 = new MyThread1("test1");
		MyThread1 t2 = new MyThread1("test2");

		// 开启线程
		t1.start();
		t2.start();
	}
}
