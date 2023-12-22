package com.itheima.set;

import com.itheima.domain.Student2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String[] args) {

		TreeSet<Student2> ts = new TreeSet<>(new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				int ageResult = o1.getAge() - o2.getAge();
				int nameResult = ageResult == 0 ? o1.getName().compareTo(o2.getName()) : ageResult;
				int result = nameResult == 0 ? 1 : nameResult;
				return result;
			}
		});
		ts.add(new Student2("张三", 23));
		ts.add(new Student2("赵六", 20));
		ts.add(new Student2("王五", 26));
		ts.add(new Student2("李四", 24));

		System.out.println(ts);

	}
}
