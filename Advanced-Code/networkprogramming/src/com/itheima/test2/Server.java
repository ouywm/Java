package com.itheima.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/*
			TCP接收和反馈
			客户端：发送一条数据，接受服务端的消息并打印
			服务端：接收数据并打印，再给客户端反馈消息
	 */

	/**
	 * 接收端，服务器
	 */
	public static void main(String[] args) throws IOException {

		// 创建ServerSocket对象，并绑定10086端口
		ServerSocket ss = new ServerSocket(10086);

		// 等待连接
		Socket socket = ss.accept();

		// 获取输入流，准备读取数据
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		int b;
		// 细节：
		// read方法会从链接通道中读取数据
		// 但是会需要一个结束标记，此处的循环才会结束
		// 否则，程序就一直停在read方法这，等待读取下面的数据
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}

		// 回写数据
		OutputStream os = socket.getOutputStream();
		os.write("有多高兴啊！".getBytes());

		// 释放资源
		ss.close();
		socket.close();
	}
}
