package test;

import java.util.Scanner;

public class PrimeNumber {
	/*
		键盘录入一个整数x，判断该数是否是一个质数


		质数:     如果一个数只能被1和本身整除，那么这个数就是质数


	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入整数：");
		int number = sc.nextInt();

		boolean flag = true;

		for (int i = 2; i < number; i++) {
			// i 依次表示这个范围内的每一个数字
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(number + "是一个质数！！！");
		}else{
			System.out.println(number + "不是一个质数！！！");
		}
	}
}
