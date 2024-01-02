package com.itheima.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1_1 {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6).forEach(s -> System.out.println(s));
		Stream.of("张三", "李四", "王五", "赵六").forEach(s -> System.out.println(s));
	}

	private static void method2() {
		int[] arr1 = {11, 22, 33};
		double[] arr2 = {11.1, 22.2, 33.3};

		Arrays.stream(arr1).forEach(i -> System.out.println(i));
		Arrays.stream(arr2).forEach(i -> System.out.println(i));
	}

	private static void method1() {
		List<String> list = new ArrayList<String>();
		list.add("张三丰");
		list.add("张无忌");
		list.add("张翠山");
		list.add("王二麻子");
		list.add("张良");
		list.add("谢广坤");
		list.stream().forEach(s -> System.out.println(s));


		Set<String> set = new HashSet<String>();
		set.add("张三丰");
		set.add("张无忌");
		set.add("张翠山");
		set.add("王二麻子");
		set.add("张良");
		set.add("谢广坤");
		set.stream().forEach(s -> System.out.println(s));


		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三丰", 100);
		map.put("张无忌", 35);
		map.put("张翠山", 55);
		map.put("王二麻子", 22);
		map.put("张良", 30);
		map.put("谢广坤", 55);
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		entrySet.stream().forEach(s -> System.out.println(s));
	}
}
