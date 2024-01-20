package com.itheima.stream.printstream;

import java.io.PrintStream;

public class PrintStreamDemo4 {
	/*
			打印流
	 */
	public static void main(String[] args) {

		// 获取打印流对象，次打印流在虚拟机启动的时候，由虚拟机自动创建，默认指向控制台
		// 特殊的打印流，系统中的标准输出流，是不能关闭的，在系统中是唯一的
		PrintStream ps = System.out;
		// 调用打印流中的的方法
		// 写出数据，自动换行，刷新
		ps.println("123");


	}
}
