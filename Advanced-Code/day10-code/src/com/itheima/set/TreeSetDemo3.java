package com.itheima.set;

import com.itheima.domain.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		// 往里面传入一个比较器对象，给他的构造方法
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			/*
				如果同时具备比较器和自然排序，会优先按照比较器的规则，进行排序操作
			 */
			@Override
			public int compare(Student o1, Student o2) {
				// Student o1 已经添加进去的， Student o2 是要添加进去的新元素
				// 这里是正序
				int ageResult = o1.getAge() - o2.getAge();
				return ageResult == 0 ? o1.getName().compareTo(o2.getName()) : ageResult;
			}
		});
		ts.add(new Student("张三",26));
		ts.add(new Student("王五",24));
		ts.add(new Student("赵六",23));
		ts.add(new Student("李四",25));

		System.out.println(ts);
	}
}
