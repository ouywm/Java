package com.itheima.set;

import com.itheima.domain.Student;

import java.util.TreeSet;

public class TerrSetDemo2 {
	/*
		TreeSet集合储存Student学生对象

	 */
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("王五",25));
		ts.add(new Student("张三",23));
		ts.add(new Student("李四",22));
		ts.add(new Student("赵六",20));

		System.out.println(ts);

	}
}
