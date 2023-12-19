package com.itheima.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
	/*
		并发修改异常 : ConcurrentModificationException

			场景 : 使用迭代器遍历集合的过程中，调用了集合对象添加，删除方法，就会出现次异常

			解决方案 : 迭代器遍历过程中，不允许使用集合对象的添加或者删除，那就使用迭代器，自己的添加或者删除方法

	        你不让我用集合的方法，那我就用迭代器的方法，这总可以了吧

	             注意 ： 删除方法，普通迭代器是有的，那时添加方法没有啊，那就用list集合的特有迭代器

	        不堪回首的往事
	            使用迭代器遍历集合的过程中，动用了集合对象的添加，删除方法，就是出现此异常，
	            删除倒数第二个元素的时候，就不会出现次异常了
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("眼瞅着你不是真正的高兴");
		list.add("温油");
		list.add("离开俺们这表面");
		list.add("伤心的人别扭秧歌");
		list.add("私奔到东北");

		System.out.println(list);

		// 获取迭代器对象
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String s = it.next();
			if ("温油".equals(s)) {
				//迭代器自己的删除方法
				it.remove();
			}
		}
		System.out.println(list);
	}
}
