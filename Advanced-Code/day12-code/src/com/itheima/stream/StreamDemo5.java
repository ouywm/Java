package com.itheima.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo5 {
	/*
		创建一个 ArrayList 集合，并添加以下字符串
		"张三,23"
		"李四,24"
		"王五,25"
		保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("张三,23");
		list.add("李四,24");
		list.add("王五,25");

		// collect : 收集器
		// 返回到一个新的map集合
		Map<String, Integer> map = list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				// 根据逗号做分割之后，拿到年龄，做大小比较
				return Integer.parseInt(s.split(",")[1]) >= 24;
			}
		}).collect(Collectors.toMap(new Function<String, String>() {
			@Override
			public String apply(String s) {
				// s 代表着一整个，根据逗号做切割，会返回一个数组，拿他的索引为0的数据就是姓名
				return s.split(",")[0];
			}
		}, new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				// 转换为Integer，根据逗号分割，拿他后面的年龄，因为是字符串所以转换成Integer
				return Integer.parseInt(s.split(",")[1]);
			}
		}));

		System.out.println(map);
	}
}
