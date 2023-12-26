package com.itheima.tools;

import com.itheima.dmain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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


		ArrayList<Student> nums = new ArrayList<>();
		Collections.addAll(nums, new Student("张三", 23), new Student("李四", 24), new Student("王五", 25));

		//从集合中找最值
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));

		//根据索引交换位置
		Collections.swap(nums, 0, 2);
		System.out.println(nums);

		//sort 对集合做排序
		ArrayList<Integer> box = new ArrayList<>();
		Collections.addAll(box, 5, 6, 2, 1, 3);
		Collections.sort(box, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(box);
	}

}
