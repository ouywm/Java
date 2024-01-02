package com.itheima.map;

import com.itheima.dmain.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
	/*
	   双列集合底层的数据结构, 都是针对于键有效, 跟值没有关系.

		   HashMap : 键唯一 (重写hashCode和equals方法)

		   TreeMap : 键排序 (实现Comparable接口, 重写compareTo方法)

		   LinkedHashMap : 键唯一, 且可以保证存取顺序
	*/
	public static void main(String[] args) {
		showTreeMap();
	}

	private static void showTreeMap() {
		TreeMap<Person, String> tm = new TreeMap<>();
		tm.put(new Person("李四", 24), "上海");
		tm.put(new Person("张三", 23), "北京");
		tm.put(new Person("王五", 25), "成都");
		tm.put(new Person("赵六", 25), "成都");



		System.out.println(tm);
	}

	private static void showHashMap() {
		HashMap<Person, String> hm = new HashMap<>();
		hm.put(new Person("李四", 24), "上海");
		hm.put(new Person("张三", 23), "北京");
		hm.put(new Person("王五", 25), "成都");
		hm.put(new Person("王五", 25), "成都");
		System.out.println(hm);
	}

	private static void showLinkedHashMap() {
		LinkedHashMap<Person, String> hm = new LinkedHashMap<>();
		hm.put(new Person("李四", 24), "上海");
		hm.put(new Person("张三", 23), "北京");
		hm.put(new Person("王五", 25), "成都");
		hm.put(new Person("王五", 25), "成都");
		System.out.println(hm);
	}
}
