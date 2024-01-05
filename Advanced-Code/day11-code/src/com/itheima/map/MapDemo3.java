package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo3 {
	/*
		根据键查找值
	 */
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("张三", "北京");
		hm.put("李四", "上海");
		hm.put("王五", "成都");

		// 最简单的遍历方式，只需要调用map通用的遍历方法forEach
		// 就可以拿到键和值了
		hm.forEach(new BiConsumer<String, String>() {
			@Override
			public void accept(String key, String value) {
				System.out.println(key + "---" + value);
			}
		});
	}

	private static void method2(HashMap<String, String> hm) {
		// 获取到所有的键值对对象
		Set<Map.Entry<String, String>> entries = hm.entrySet();
		// 遍历set集合获取到每一个键值对对象
		for (Map.Entry<String, String> entry : entries) {
			// 通过键值对对象，获取键和值
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}

	private static void method1(HashMap<String, String> hm) {
		// 获取所有的键
		Set<String> keySet = hm.keySet();
		//遍历set集合，获取每一个键
		for (String key : keySet) {
			// 顶用map集合的get方法，根据键查找对应的值
			String value = hm.get(key);
			System.out.println(key + "---" + value);
		}
	}
}