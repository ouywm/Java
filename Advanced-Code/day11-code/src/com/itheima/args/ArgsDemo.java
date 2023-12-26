package com.itheima.args;

public class ArgsDemo {
	/*

		可变参数

		数据类型...变量名

		其实就是用了一个数组来接收，由这个数组来接收传入的参数，来达到可变参数的效果
		因为差不多就是数组，所以形参给个同类型数组也可以

		注意事项：

				已经定义了一个可变参数，但是还想加普通参数，普通参数得放前面，可变参数放后面那，
				为啥？让可变参数放前面，不全把参数吃了，普通参数没得吃，可变参数就只能有一个

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