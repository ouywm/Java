package com.itheima.collection;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	/*
		public Iterator<E> iterator() : 获取遍历集合的迭代器

		public E next() : 从集合中获取一个元素

		注意 : 如果next() 方法调用次数过多，会出现NoSuchElementException

		public boolean hasNext() :  如果仍有元素可以迭代，则返回 true。

		next()最好就只调用一次，因为要避免 NoSuchElementException
		为什么？？？
			System.out.println(stu.getName() + "---" + stu.getAge());
		因为在第一次调用的时候，返回的是张三的姓名，然后后面又调用一次next()，源码里面的指针就指向了下一个索引，就是李四的年龄了，
		再到后面，又调用，这次就是调用王五的姓名了，然后再调用next()就是指向了下一位索引的年龄，没有啊，就直接给你报错了呗

		 public boolean hasNext() {
            return cursor != size;
        }

		it.hasNext()方法返回的就是布尔类型，true或者false，比较的是当前指针不等于集合长度，如果等于就返回false，不会执行
		但是调用多次next()就无法保证了

		for循环跟forEach循环底层都是迭代器
	 */
	public static void main(String[] args) {

		Collection<Student> c = new ArrayList<Student>();

		c.add(new Student("张三", 23));
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));

		// 1.获取迭代器
		Iterator<Student> it = c.iterator();


		//2.循环判断，集合中是否还有元素
		while (it.hasNext()) {
			//调用next()方法，将元素获取出来
			Student stu = it.next();
			System.out.println(stu.getName() + "---" + stu.getAge());
		}

		System.out.println("-----------------------------------------------");

		// 增强for循环
		// 这样看代码是真简洁呀，不过阅读性不如上一个哈哈
		/*
		 		格式:
		 			for( 数据类型 变量名想起啥随便自己: 要遍历的集合或者数组 ){

		             }
		 */
		for (Student stu : c) {
			System.out.println(stu);
		}

		/*
			foreach(实现类);
		 */


		System.out.println("--------------------------------");
		//foreach方法遍历集合
		c.forEach(student -> System.out.println(student.getName()+"---"+student.getAge()));


		//里面写了一个匿名，重写里面的accept方法输出，底层还是迭代器
		/*c.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student student) {
				System.out.println(student);
			}
		});
		*/


	}
}
