package com.itheima.generics;

import java.util.ArrayList;

public class GenericsDemo5 {
	/*
		泛型通配符

				? : 任意类型
	 */
	public static void main(String[] args) {


		ArrayList<Coder> list1 = new ArrayList<>();
		list1.add(new Coder());

		ArrayList<Manager> list2 = new ArrayList<>();
		list2.add(new Manager());

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("abc");


		method(list1);
		method(list2);
	}

	// 因为 "?" 是通配符，什么都可以往里面进去，这样好吗？？一点也不好，那我给他设置参数的时候，就给他
	//设置任意的，但是是继承Employee这个类的才可以往里面进去，


	public static void method(ArrayList<? extends Employee> list) {
		for (Object o : list) {
			//向下转型，将Object转换成两个子类的父类
			Employee e = (Employee) o;
			e.work();
		}
	}
}

//员工类
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
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee{name = " + name + ", salary = " + salary + "}";
	}
}

//程序员类
class Coder extends Employee {
	@Override
	public void work() {
		System.out.println("程序员写代码...");
	}
}

//项目经理类
class Manager extends Employee {

	@Override
	public void work() {
		System.out.println("项目经理分配任务...");
	}
}