package com.itheima.dupdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
	public static void main(String[] args) throws IOException {
		// 接收数据

		// 1.创建DatagramSocket接收端对象(快递公司)
		// 细节：
		// 在接收的时候，一定要绑定端口
		// 而且绑定的端口，一定要跟发送的端扣保持一致
		DatagramSocket ds = new DatagramSocket(10086);

		// 拆包
		byte[] bytes = new byte[1024];

		// 新建包
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

		// 接收数据包
		// 该方法是阻塞的，会在这里死等，直到等到数据发送过来才继续往下走
		ds.receive(dp);

		// 解析数据包
		// 获取传过来的数据，类型为字节
		byte[] data = dp.getData();
		// 有少个字节
		int len = dp.getLength();
		// 通过字符串的构造方法，将字节数组，转换成字符串
		String str = new String(data, 0, len);
		// 获取是哪一台电脑所发送的信息
		InetAddress address = dp.getAddress();
		// 获取是哪个端口发送的信息
		int port = dp.getPort();

		System.out.println("接收到数据" + str);
		System.out.println("该数据是从" + address + "这台电脑的" + port + "这台端口所发出的");

		// 释放资源
		ds.close();
	}
}
