package com.itheima.domain;

/*
 * 这里的泛型表示，要比较的对象，接口的泛型就跟着类走呗
 * 这个接口有个泛型，因为人家也不知道你要拿啥类型的来做比较，
 * 就随便你了呗，由你决定哈哈
 */
public class Student implements Comparable<Student> {

	/*
	  每一次调用add添加方法的时候，都会调用compareTo方法，看他的返回值是啥，
	  如果是0就是不添加元素，表示里面有相同的元素不添加，但是第一个添加的元素是根节点，
	  就只添加一个，然后后面添加的元素就会跟他作比较，因为一添加就会调用compareTo这个方法，
	  这里的返回值如果是0就表示都是一样的，有相同的元素就不添加了呗！正数1就是正序输出，
	  -1就是倒序输出
	  返回值影响添加
	 */
	@Override
	public int compareTo(Student o) {
		// 0 表示一样的，一样的就不添加
		// 1 表示是比根节点更大的值，就比右边大了，都往右边走，输出我们看到的就是正序
		// -1 就是比根节点更小的喽，往左边走，所以我们看到的就是倒序
		return this.age - o.age;
	}

	private String name;
	private int age;

	public Student() {
	}

	/**
	 * 姓名跟年龄呗！！
	 *
	 * @param name
	 * @param age
	 */
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

	/**
	 * @return 打印对象名，就不会看到地址值了，因为重写了toString
	 */
	public String toString() {
		return "Student{name = " + name + ", age = " + age + "}";
	}


}
