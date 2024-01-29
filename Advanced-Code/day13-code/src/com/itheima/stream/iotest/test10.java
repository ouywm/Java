package com.itheima.stream.iotest;

import java.io.*;
import java.util.Scanner;

public class test10 {
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
		BufferedReader br = new BufferedReader(new FileReader("D:\\Codes\\Codes\\Advanced-Code\\" +
				                                                      "day13-code\\src\\com\\itheima\\stream\\" +
				                                                      "iotest\\userInfoCount.txt"));
		// 开始读取
		String line = br.readLine();
		// 关流
		br.close();
		// 根据&分割获取里面的每一项
		String[] userinfo = line.split("&");
		// 获取账号
		String[] arr1 = userinfo[0].split("=");
		String name = arr1[1];
		// 获取密码
		String[] arr2 = userinfo[1].split("=");
		String password = arr2[1];

		// 获取次数
		String arr3 = userinfo[2];
		String[] countStr = arr3.split("=");
		int count = Integer.parseInt(countStr[1]);

		// 提示用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String inputName = sc.nextLine();
		System.out.println("请输入密码:");
		String inputPassword = sc.nextLine();

		// 判断用户输入是否正确，且次数小于3
		if (inputName.equals(name) && inputPassword.equals(password) && count < 3) {
			System.out.println("登录成功！");
			// 登录成功刷新次数
			writeInfo("username=" + name + "&" + "password=" + password + "&" + "count=" + "0");
		} else {
			System.out.println("登录失败");
			// 登录失败次数加加
			count++;
			// 判断次数是否小于三
			if (count < 3) {
				System.out.println("登陆失败,还剩下" + (3 - count) + "次机会");
			} else {
				System.out.println("用户账户被锁定");
			}
			// 写入加加后的值，刷新本地文件登录次数
			writeInfo("username=" + name + "&" + "password=" + password + "&" + "count=" + count);
		}
	}


	/**
	 * 作用：写出字符串到本地文件
	 * 形参：要写到本地文件的字符串
	 */
	private static void writeInfo(String str) throws IOException {
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:\\Codes\\Codes\\Advanced-Code\\day13-code\\src\\com\\itheima\\stream\\iotest\\userInfoCount.txt"));
		bw2.write(str);
		bw2.close();
	}
}
