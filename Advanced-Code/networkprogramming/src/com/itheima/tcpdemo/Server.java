package com.itheima.tcpdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/**
	 * 接收端服务器
	 */
	public static void main(String[] args) throws IOException {

		// 创建ServerSocket对象
		ServerSocket ss = new ServerSocket(10086);
		// 监听客户端的链接
		Socket socket = ss.accept();

		// 从链接通道中获取输入流读取数据
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();


		byte[] bytes = new byte[1024];
		int len = is.read(bytes);

		String str = new String(bytes,0,len);

		System.out.println(str);

		// 释放资源
		ss.close();
		socket.close();
	}
}
