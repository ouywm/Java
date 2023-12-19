package com.itheima.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
			LinkedList 特有方法 ：

				public void addFirst(E e) : 头部添加
				public void addLast(E e) : 尾部添加
				public void getFirst() : 获取第一个
				public void getLast() : 获取最后一个
				public void removeFirst() : 删除第一个
				public void removeLast() : 删除最后一个
	 */

	/*
			LikedList集合，底层是双向链表结构，查找元素的时候会从头部，或者尾部逐个查找
			但是它属于List体系中的集合，也可以使用get方法，根据索引直接获取元素，
			这其中？？咋玩的？？
	 */
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");

		String s = list.get(1);
		System.out.println(s);
	}

	private static void method2() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.removeFirst();
		list.removeLast();

		System.out.println(list);
	}

	private static void method1() {
		LinkedList<String> list = new LinkedList<String>();

		list.addFirst("张三");
		list.addFirst("李四");
		list.addFirst("王五");
		list.addLast("赵六");

		// 王五 李四 张三 赵六

		System.out.println(list);
	}
}
