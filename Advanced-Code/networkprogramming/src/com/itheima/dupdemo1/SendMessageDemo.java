package com.itheima.dupdemo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {
	public static void main(String[] args) throws IOException {
		// 发送数据


		// 1.找快递公司，创建DatagramSocket对象
		// 细节：
		// 会绑定端口，以后就是通过端口往外发送数据
		// 空参：所有可用的端口中随机一个进行使用
		// 有参：指定端口号进行绑定
		DatagramSocket ds = new DatagramSocket();

		// 2.打包数据
		// 要发送的信息字符串是不能发送的
		String str = "你好你好";
		// 需要转换成字节数组
		byte[] bytes = str.getBytes();
		// 指定发送端口
		int port = 10086;
		// 指定IP，哪一个电脑
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

		// 3.发送数据
		ds.send(dp);

		// 4.释放资源
		ds.close();

	}
}
