package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {
	/*
		迭代器遍历集合的过程中，使用集合的删除方法，删除倒数第二个元素，就不会出现错误

		因为是倒数第二个元素，在指针指向这个元素的时候，拿他出来作比较，如果是def那就做删除，删除完成之后，
		集合中不会允许空值的存在，删除元素的后面那一个元素会自动往上补，集合的长度也会变成-1，那在调用hasNext方法的时候
		索引跟集合的长度是一样的，就不会调用next里面的checkForComodification();这个异常，所以就不会报错
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("abc");
		list.add("bbb");
		list.add("def");
		list.add("ccc");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String s = it.next();
			if ("def".equals(s)) {
				list.remove(s);
			}
		}
		System.out.println(list);
	}
}
