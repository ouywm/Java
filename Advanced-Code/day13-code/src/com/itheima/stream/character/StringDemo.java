package com.itheima.stream.character;

import java.io.IOException;
import java.util.Arrays;

public class StringDemo {
	/*

			平台默认字符编码 Unicode - UTF-8的形式

			重点记忆 ： 中文字符，同场地哦也是由负数的字节进行组成的，
						特殊情况，可能会出现整数，但是就算有正数，第一个字节肯定是负数


			注意事项 ： 今后如果出现乱码问题： 大概率是因为编解码方式不一致所导致的

			编码：字符转字节
				public byte[] getBytes() : 使用平台默认字符编码方式，对字符串编码
				public byte[] getBytes(String charsetName) : 使用字符串编码当时，对字符串编码

			解码 : 字符转字节
				public String(byte[] bytes) : 使用平台默认字符编码方式，对字符串解码
				public String(byte[] bytes, String charsetName) : 使用字符串编码方式，对字符串解码

	 */
	public static void main(String[] args) throws IOException {

		// 编码就是把字符串转成字节
		String s = "你好,你好";
		byte[] bytes = s.getBytes();
		System.out.println(Arrays.toString(bytes));

		byte[] gbks = s.getBytes("gbk");
		System.out.println(Arrays.toString(gbks));

		System.out.println("-----------------------------------------");

		byte[] utf8Bytes = {-28, -67, -96, -27, -91, -67, 44, -28, -67, -96, -27, -91, -67};
		byte[] gbkBytes = {-60, -29, -70, -61, 44, -60, -29, -70, -61};

		// 解码就是把自己转换成能看懂的字符串
		String s1 = new String(gbkBytes, "GBK");
		System.out.println(s1);

	}
}
