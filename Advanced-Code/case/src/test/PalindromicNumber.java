package test;

public class PalindromicNumber {
	/*
		需求：给你一个整数 X
		如果X是一个回文整数，打印true，否则打印false
		解释：回文舒是指正序(从左向右)和倒序(从右向左)读都是一样的整数
		例如，121是回文，而123不是
	 */
	public static void main(String[] args) {

		// 定义数字
		int x = 12345;
		// 定义一个临时变量，用于记录x
		int temp = x;
		// 结果
		int num = 0;

		while (x != 0) {
			// 获取个位
			int ge = x % 10;
			// 修改x，去掉个位
			x = x / 10;
			// 把获取到的数字拼接到最右边
			num = num * 10 + ge;

		}
		// 打印
		System.out.println(num == temp);
	}
}
