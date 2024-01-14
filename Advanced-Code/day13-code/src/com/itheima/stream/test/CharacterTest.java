package com.itheima.stream.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class CharacterTest {

	/*
		统计文件每一个字符出现的次数，随后展示在控制台


		效果：
			A(1)B(2)C(3)
	 */
	public static void main(String[] args) throws IOException {
		// 准备map集合，用于统计每一种字符出现的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		// 创建字符输入流，读取纯文本文件
		FileReader fr = new FileReader("D:\\info.txt");
		// 读取字符
		int i;
		while ((i = fr.read()) != -1) {
			char c = (char) i;
			if (!hm.containsKey(c)) {
				hm.put(c, 1);
			} else {
				hm.put(c, hm.get(c) + 1);
			}
		}
		// 关闭输入流
		fr.close();

		// 准备StringBuilder用与拼接操作
		StringBuilder sb = new StringBuilder();

		hm.forEach(new BiConsumer<Character, Integer>() {
			@Override
			public void accept(Character key, Integer value) {
				sb.append(key).append("(").append(value).append(")");
			}
		});

		System.out.println(sb);
	}

}
