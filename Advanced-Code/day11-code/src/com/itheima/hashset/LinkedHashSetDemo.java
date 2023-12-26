package com.itheima.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/*
		LinkedHashSet特点 : 去重，并保证存取顺序

		双向链表，在添加元素的时候，上一个元素会下一个元素的地址，下一个元素也会记录上一个的元素地址
		这就是元素存取顺序，还有去重，去重倒是早就知道为啥能去重了
	 */
	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("c");
		lhs.add("d");
		lhs.add("b");
		lhs.add("a");
		lhs.add("c");
		System.out.println(lhs);
	}
}
