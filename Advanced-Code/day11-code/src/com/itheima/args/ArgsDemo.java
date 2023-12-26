package com.itheima.args;

public class ArgsDemo {
	/*

		可变参数

		数据类型...变量名

		其实就是用了一个数组来接收，来达到可变参数的效果

	 */
	public static void main(String[] args) {

		System.out.println(getSum(1, 2));


		System.out.println(getString("1","1"));
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