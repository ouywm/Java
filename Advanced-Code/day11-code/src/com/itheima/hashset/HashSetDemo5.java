package com.itheima.hashset;

import java.util.HashSet;

public class HashSetDemo5 {
	/*
		底层数组长度为16，跟arraylist集合一样，也是会扩容的，他的扩容是怎么扩容的呢？
			有条件的，条件是啥，因为底层在JDK8之前是数组加链表，JDK8之后是数组加链表加红黑树
			在集合中元素超过了0.75就会扩容，就是12个元素，存储的元素到了有12个了，会扩容两倍
			还有就是链表挂载的元素超过8个，数组长度没有超过64，就会扩容，
			在元素超过8个，数组长度也超过64了，自动转换为红黑树


			在添加数据的时候，有索引相同的情况，在JDK8之前，是头插法，会跑过去当头，去链表的最上面，JDK8之后是尾插法
			给人家当节点去了，挂载在人家的下面
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		hs.add("a");
		hs.add("q");
		hs.add("Ñ");
		hs.add("á");
		hs.add("ñ");
		hs.add("ā");
		hs.add("Α");
		hs.add("Ǒ");

		System.out.println("8个元素的时候:" + hs);

		hs.add("Ł");

		System.out.println("9个元素的时候:" + hs);

		hs.add("ǡ");
		hs.add("Ǳ");
		hs.add("ȁ");

		System.out.println("12个元素的时候:" + hs);
	}

	private static void findHashIsOne() {
		for (int i = 97; i <= 1000; i++) {
			char c = (char) i;
			String s = String.valueOf(c);
			int hash = s.hashCode();
			hash = (hash ^ (hash >>> 16)) % 16;
			if (hash == 1) {
				System.out.println(s);
			}
		}
	}
}
