package com.itheima.hashset;

import com.itheima.dmain.Student;

import java.util.HashSet;

public class hashDemo {
	public static void main(String[] args) {
		new Student("张三",23);
		new Student("李四",23);
		new Student("王五",23);
		new Student("赵六",23);
		new Student("赵六",23);
		new Student("孙七",23);
		new Student("周八",23);

		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("1",1));
	}
}
