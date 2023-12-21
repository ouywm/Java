package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	/*
		TreeSet集合的特点体验 : 排序，去重

		下面的就是去掉重复的了，还有排了序
	 */
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("d");
		ts.add("c");
		ts.add("a");
		ts.add("d");
		ts.add("b");
		ts.add("d");
		ts.add("e");
		ts.add("d");
		System.out.println(ts);

	}
}
