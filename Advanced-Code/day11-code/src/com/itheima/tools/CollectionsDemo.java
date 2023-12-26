package com.itheima.tools;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	/*
		public static <T> boolean addAll (Collection<? super T> c , T... elements)给集合对象批量添加对象
		public static void shuffle(List<?> list) 打乱LISt集合对象的顺序
		public static <T> int binarySearch(List<?> list,T key) 以二分查找法查找元素
		public static <T> void max/min(Collection<T>coll) 根据默认的自然排序获取最大最小值
		public static <T> void swap (List<?> list,iny i,int j) 交换集合中只带你位置的元素
	 */
	public static void main(String[] args) {
		//批量添加
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c", "d");
		System.out.println(list);

		// 二分查找(前提：必须是排序好的)
		System.out.println(Collections.binarySearch(list, "b"));

		//打乱list集合对象的顺序，就是字面意思，跟洗牌差不多
		Collections.shuffle(list);
		System.out.println(list);


		ArrayList<Integer> nums = new ArrayList<>();
		//从集合中找最值
		Collections.addAll(nums, 1, 2, 3, 4, 5);
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
	}
}
