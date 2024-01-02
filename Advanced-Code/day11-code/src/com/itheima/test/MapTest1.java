package com.itheima.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest1 {
	/*
		需求 ： 字符串 aababcabcdabcde
					请统计字符串每一个字符出现的次数，并按照一下格式输出
					输出结果 ：
						a(5)b(4)c(3)d(2)e(1)
	 */
	public static void main(String[] args) {
		String info = "aababcabcdabcde";

		// 准备map集合，用于统计字符的次数
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		// 拆分字符
		char[] charArray = info.toCharArray();
		// 遍历字符数组,获取每一个字符
		for (char c : charArray) {
			// 判断集合中是否包含给定的字符
			if (tm.containsKey(c)) {
				// 存在：调用get方法，根据键查找值，然后加一(获取旧值，加1，存回去)
				tm.put(c, tm.get(c) + 1);
			} else{
				// 不存在：就添加，第一次添加，当然是1
				tm.put(c, 1);
			}
		}

		// 字符串拼接，用一个StringBuilder
		StringBuilder sb = new StringBuilder();

		/** 最简单的forEach遍历
		 *  给上一个实现类
		 */
		tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
		System.out.println(sb);


		/**
		  获取键值对对象，然后获取键和值
		 */
		Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
		for (Map.Entry<Character, Integer> entry : entries) {
			System.out.print(entry.getKey() + "(" + entry.getValue() + ")" + " ");
		}

		/**
		 根据键获取值
		 */
		// 获取所有的键
		Set<Character> keySet = tm.keySet();
		//遍历set集合，获取每一个键
		for (Character key : keySet) {
			// 顶用map集合的get方法，根据键查找对应的值
			Integer value = tm.get(key);
			System.out.print(key + "(" + value + ")" + " ");
		}
	}
}
