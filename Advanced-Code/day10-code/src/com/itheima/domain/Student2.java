package com.itheima.domain;

public class Student2 implements Comparable<Student2> {

	private String name;
	private int age;

	@Override
	public int compareTo(Student2 o) {
		int ageResult = o.age - this.age;
		int nameResult = ageResult == 0 ? o.name.compareTo(this.name) : ageResult;
		int result = nameResult == 0 ? 1 : nameResult;
		return result;
	}


	public Student2() {
	}

	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 获取
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取
	 *
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置
	 *
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student2{name = " + name + ", age = " + age + "}";
	}


}
