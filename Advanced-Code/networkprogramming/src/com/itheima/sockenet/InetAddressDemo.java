package com.itheima.sockenet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	/*
		static InetAddress getByName(String host) 确定名称可以是机器的名称，也可以是IP地址
		String getHostName()            获取此IP地址的主机名
		String grtHostAddress()         返回文本显示中的IP地址字符串
	 */
	public static void main(String[] args) throws UnknownHostException {

		// 获取InetAddress对象
		// 获取IP的对象，可以看做是一台电脑的对象
		InetAddress address = InetAddress.getByName("127.0.0.1");


		// 获取电脑的主机名
		String name = address.getHostName();

		// 获取IP对象地址
		String ip = address.getHostAddress();



	}
}
