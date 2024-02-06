package com.itheima.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	/*
			TCP接收和反馈
			客户端：发送一条数据，接受服务端的消息并打印
			服务端：接收数据并打印，再给客户端反馈消息
	 */

	/**
	 * 发送端，客户端
	 */
	public static void main(String[] args) throws IOException {

		// 创建Socket并连接服务端
		Socket socket = new Socket("127.0.0.1", 10086);

		String str = "见到你，我很高兴！！";
		// 获取输出流
		OutputStream os = socket.getOutputStream();
		os.write(str.getBytes());
		// 结束标记
		socket.shutdownOutput();
		// 接收服务端回写的数据，获取输入流，读取
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		// 读取反馈的消息
		int b;
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}

		// 释放资源
		socket.close();

	}
}
