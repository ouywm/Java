package com.itheima.dupdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessageDemo {

	/*
			按照下面的要求实现程序
				UDP发送数据，数据来自于键盘录入，直到输入的数据是886，发送数据结束
				UDP接收数据，因为接收端不知道发送端什么时候停止发送，故采用循环接收
	 */
	public static void main(String[] args) throws IOException {
		// 接收数据

		DatagramSocket ds = new DatagramSocket(10086);

		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		while (true) {
			ds.receive(dp);

			byte[] data = dp.getData();
			int len = dp.getLength();
			String str = new String(data, 0, len);
			// 先获获取哪台电脑，在获取IP，链试编程
			String ip = dp.getAddress().getHostAddress();
			// 先获取哪台电脑，在获取主机名
			String name = dp.getAddress().getHostName();

			System.out.println("IP为：" + ip + "主机名为：" + name + "的人，发送了数据：" + str);
		}
		// 因为是无限循环等待所以不用是否资源
//		ds.close();
	}
}
