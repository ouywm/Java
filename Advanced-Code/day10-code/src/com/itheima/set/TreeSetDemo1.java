package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	/*
		TreeSet集合的特点体验 : 排序，去重

		下面的就是去掉重复的了，还有排了序

		为啥有去重的效果？？？
		因为TreeSet集合在调用add方法添加的时候，会自动调用一个compareTo()这样的方法，
		会有返回值，负数代表比她小，0就代表是一样的，正数就代表比它大
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
