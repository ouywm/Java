package com.itheima.string;

import java.util.TreeSet;

public class StringTest {

	/*
			String 也实现了Comparable，所以里面的compareTo String 他重写了这个方法，
			我们就可以使用这个方法来进行比较

			字符串有他自己的比较规则

	 */
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "b";
		System.out.println(s1.compareTo(s2));

		String s3 = "张";
		String s4 = "王";
		System.out.println(s3.compareTo(s4));

		TreeSet<String> ts = new TreeSet<>();
		ts.add("a");
		ts.add("c");
		ts.add("d");
		ts.add("baa");
		ts.add("aa");
		ts.add("az");

		System.out.println(ts);
	}
}
