package com.itheima.test.grabredpacket;

import java.util.Random;

public class MyThread extends Thread {

	// 定义红包金额
	static double money = 100;
	// 红包个数
	static int count = 3;
	// 抢到红包最小值
	static final double MIN = 0.01;


	@Override
	public void run() {

		// 同步代码块
		synchronized (MyThread.class) {
			// 判断是否还有红包
			if (count == 0) {
				System.out.println(getName() + "没有抢到红包");
			} else {
				// 定义一个变量，表示抢到红包的金额
				double price = 0;
				if (count == 1) {
					// 最后一个红包了
					price = money;
				} else {
					// 表示第一，第二次(随机)
					Random r = new Random();
					// 100元 3个包
					// 第一个红包最大值 99.98
					// 其他两个红包 100 - (3-1) * 0.01
					double bounds = money - (count - 1) * MIN;
					price = r.nextDouble(bounds);
					if (price < MIN) {
						price = MIN;
					}
				}
				// 从money中，去掉当前抢到红包的金额
				money = money - price;
				// 红包个数减一
				count--;
				System.out.println(getName() + "抢到红包" + price);
			}
		}
	}
}
