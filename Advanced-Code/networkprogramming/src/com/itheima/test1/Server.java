package com.itheima.test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/**
	 * 服务器：接收多次发送数据并打印
	 */
	public static void main(String[] args) throws IOException {

		// 创建对象绑定端口10086
		ServerSocket ss = new ServerSocket(10086);

		// 等待连接
		Socket socket = ss.accept();

		// 获取输入流，读取数据
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		int b;
		while ((b = isr.read()) != -1) {
			System.out.println((char) b);
		}
/*		byte[] bytes = new byte[1024];
		while (true) {
			int len = is.read(bytes);
			String str = new String(bytes, 0, len);
			System.out.println(str);
		}*/


//		ss.close();
//		socket.close();
	}
}
