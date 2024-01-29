package com.itheima.stream.iotest.domain;

public class Student {
	private String name;
	private String sex;
	private int age;
	private double weight;

	public Student() {
	}

	public Student(String name, String sex, int age, double weight) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
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
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 设置
	 *
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
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

	/**
	 * 获取
	 *
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * 设置
	 *
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return name + "-" + sex + "-" + age + "-" + weight;
	}
}
