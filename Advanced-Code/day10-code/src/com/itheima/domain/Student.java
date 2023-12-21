package com.itheima.domain;

public class Student<Student> implements Comparable<Student> {

	/**
	 * 每一次调用add添加方法的时候，都会调用compareTo方法，看他的返回值是啥，
	 * 如果是0就是不添加元素，表示里面有相同的元素不添加，但是第一个添加的元素是根节点，
	 * 就只添加一个，然后后面添加的元素就会跟他作比较，因为一添加就会调用compareTo这个方法，
	 * 这里的返回值如果是0就表示都是一样的，有相同的元素就不添加了呗！正数1就是正序输出，
	 * -1就是倒序输出
	 * @param o the object to be compared.
	 * @return 返回值影响添加
	 */
	@Override
	public int compareTo(Student o) {
		return 0;
	}

	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
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
		return "Student{name = " + name + ", age = " + age + "}";
	}


}
