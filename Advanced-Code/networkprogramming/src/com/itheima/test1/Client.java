package com.itheima.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	/**
	 * 客户端：多次发送数据
	 */

	public static void main(String[] args) throws IOException {

		// 创建Socket对象，并链接服务端
		Socket socket = new Socket("127.0.0.1",10086);

		// 从链接中获取输出流往外写出数据
		OutputStream os = socket.getOutputStream();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入您要发送的信息：");
			String str = sc.nextLine();
			if(str.equals("886")){
				break;
			}
			os.write(str.getBytes());

		}

		socket.close();
	}
}
