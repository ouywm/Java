package test;

public class test2 {
	/*
		需求：给定两个整数，被除数和除数，(都是正数，且不超过int的范围)
		将两束相除，要求不使用乘法，触发和%运算符
		得到商和余数
	 */
	public static void main(String[] args) {

		// 除数
		int divisor = 3;
		// 被除数
		int dividend = 7;
		// 记录次数
		int count = 0;

		while (dividend >= divisor) {

			dividend = dividend - divisor;
			// 相减一次变量自增
			count++;
		}
		// 余数
		System.out.println("余数是:" + dividend);
		// 商
		System.out.println("商是:" + count);
	}
}
