package test;

import java.util.Scanner;

public class SquareRoot {
	/*
		求平方根
		需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
		结果只保留整数的部分，小数部分将被舍去

		平方根：
				16 -> 4
				4 -> 2
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 键盘录入
		System.out.println("请输入一个大于2的整数");
		int number = sc.nextInt();

		// 从一开始循环判断
		for (int i = 1; i <= number; i++) {

			if (i * i == number) {
				System.out.println(i + "就是" + number + "的平方根");
				break;
			} else if (i * i > number) {
				System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
				break;
			}
		}
	}
}
