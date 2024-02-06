package com.itheima.tcpdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	/**
	 * TCP协议 服务端发送端
	 */
	public static void main(String[] args) throws IOException {

		// 创建Socket对象
		// 细节：在创建对象的同时会连接服务端
		// 连接不上代码会报错
		Socket socket = new Socket("127.0.0.1",10086);

		// 从连接通道中获取输出流
		OutputStream os = socket.getOutputStream();
		// 写出数据
		os.write("你好你好".getBytes());

		// 释放资源
		os.close();
		socket.close();
	}
}
