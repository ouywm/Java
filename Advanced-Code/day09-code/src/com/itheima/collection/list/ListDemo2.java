package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	/*
		List集合的遍历方式：

			1.迭代器遍历
			2.增强for循环
			3.foreach方法
			4.普通for循环
			5.ListIterator (List集合特有的迭代器)
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");

		// 获取迭代器
		Iterator<String> it = list.iterator();
		//迭代器循环
		// hasNext是看有没有下一个元素，如果有下一个元素的话就返回true，没有就false
		System.out.println("迭代器循环");
		while (it.hasNext()) {
			/* 里面有一个指针，最开始的时候指向第一个元素，然后获取这个元素，获取完之后，开始下一轮循环，继续调用hasNext方法，
				去判断还有没有下一个，有就继续，继续就把指针移到下一位然后再获取元素，以此类推
			* */
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");

		// 增强for循环
		System.out.println("增强for循环");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("--------------------------------");

		// 普通for循环，因为list集合是有索引，所以可以通过索引获取元素，可以用普通for循环
		System.out.println("普通for循环");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------------");

		// list 的特有遍历方式
		System.out.println("list 的特有遍历方式");
		ListIterator<String> stringListIterator = list.listIterator();
		while (stringListIterator.hasNext()) {
			String next = stringListIterator.next();
			System.out.println(next);
		}
		System.out.println("--------------------------------");

		/*逆向遍历
			hasPrevious判断前一位有没有元素，如果有就返回true没有就返回false，跟hasNext是差不多的

			previous就是从最后一位元素，通过那个指针，最开始指向最后一位，然后获取元素，获取完之后这个while循环就执行完毕
			然后开始下一轮循环，调用hasPrevious，判读有没有前一位，有就继续喽，然后指针指向前面那个元素，获取元素，开始下一轮
		*/

		// 这样如果逆向遍历在正向遍历之前调用，最开始的指针就在最前面，所以逆向根本没法遍历

		System.out.println("逆向遍历");
		while (stringListIterator.hasPrevious()) {
			String previous = stringListIterator.previous();
			System.out.println(previous);
		}

	}
}
