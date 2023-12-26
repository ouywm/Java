package com.itheima.args;

public class ArgsDemo {
	/*

		可变参数

		数据类型...变量名

		其实就是用了一个数组来接收，由这个数组来接收传入的参数，来达到可变参数的效果
		int[] arr = {}; 差不多跟这一样


	 */
	public static void main(String[] args) {

	}

	public static int getSum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static String getString(String... strings) {

		StringBuilder str = new StringBuilder();

		for (String string : strings) {
			str.append(string);
		}
		return str.toString();
	}
}