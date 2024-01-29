package com.itheima.stream.iotest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test9 {
	/*
		需求：写一个登录小案例
		步骤：
			将好着呢宫阙的用户名和密码手动保存在本地的userinfo.txt文件中
			保存格式为：username=zhangsan&password=123
			让用户键盘录入用户名和密码
					比较用户录入的正确的用户名密码是否一致
			如果一致就登录成功
					不一致就打印登录失败
	 */
	public static void main(String[] args) throws IOException {
		// 创建字符输出流关联本地文件
		BufferedReader br = new BufferedReader(new FileReader("D:\\Codes\\Codes\\Advanced-Code\\day13-code\\src\\com\\itheima\\stream\\iotest\\userInfo.txt"));
		// 开始读取
		String line = br.readLine();
		// 关流
		br.close();
		// 按照&切割获取到账号跟密码
		String[] arr = line.split("&");
		// 再次切割获取具体账号
		String[] name = arr[0].split("=");
		// 切割获取具体密码
		String[] password = arr[1].split("=");
		// 创建输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String inputName = sc.nextLine();
		System.out.println("请输入用户名");
		String inputPassword = sc.nextLine();
		// 判断输入是否跟文件内容一样
		if (inputName.equals(name[1]) && inputPassword.equals(password[1])) {
			System.out.println("登录成功:");
		} else {
			System.out.println("密码错误:");
		}
	}
}
