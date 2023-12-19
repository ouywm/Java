package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;


/**
 * @author oywm
 */
public class CollectionTest1 {
	/*

		单列集合的接口
				list集合跟set集合继承了Collection接口，是层次接口中的跟接口，构成Collection的单位
				称为元素，一般类说呢，Collection接口不能直接使用，但是该接口提供了增加，删除元素和管理数据的一些方法，
				并且set结合和list集合了Collection接口，因此这些方法对于list集合和set集合是通用的

		Collection的常用方法:

				public boolean add(E e) : 把给定的对象添加到当前集合中
				public void clear() : 清空集合中的所有元素
				public boolean remove(E e) : 把给定的对象在当前集合中删除
				public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
				public boolean isEmpty() : 判断当前集合是否为空
				public int size() : 安徽集合中元素的个数(集合的长度)
	 */
	public static void main(String[] args) {

		Collection<Student> c = new ArrayList<>();

		c.add(new Student("张三", 23));
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));

		System.out.println(c);

		c.remove(new Student("李四", 24));
		System.out.println(c);

	}

	private static void method() {
		//以多态的形式创建集合对象，调用单列 集合中的共有方法
		Collection<String> c = new ArrayList<>();

		c.add("张三");
		c.add("李四");
		c.add("王五");

		boolean b = c.contains("赵四");

		System.out.println(b);
		System.out.println(c.size());
	}
}