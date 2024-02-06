package com.itheima.dupdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {
	/*
			按照下面的要求实现程序
				UDP发送数据，数据来自于键盘录入，直到输入的数据是886，发送数据结束
				UDP接收数据，因为接收端不知道发送端什么时候停止发送，故采用循环接收
	 */
	public static void main(String[] args) throws IOException {
		// 发送数据

		// 创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入您要发送的消息");
			String str = sc.nextLine();
			if (str.equals("886")) {
				break;
			}
			byte[] bytes = str.getBytes();
			int port = 10086;
			InetAddress address = InetAddress.getByName("127.0.0.1");
			// 打包
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

			// 发送包
			ds.send(dp);
		}

		// 释放资源
		ds.close();

	}
}
