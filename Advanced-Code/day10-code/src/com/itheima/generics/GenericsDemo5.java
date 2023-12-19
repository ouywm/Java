package com.itheima.generics;

public class GenericsDemo5 {
	/*
		泛型通配符
	 */
	public static void main(String[] args) {


	}
}

abstract class Employee {
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public abstract void work();

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
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取
	 *
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * 设置
	 *
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee{name = " + name + ", salary = " + salary + "}";
	}
}

class Coder extends Employee {
	@Override
	public void work() {
		System.out.println("程序员写代码...");
	}
}

class Manager extends Employee {

	@Override
	public void work() {
		System.out.println("项目经理分配任务...");
	}
}