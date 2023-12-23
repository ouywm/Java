package com.itheima.dmain;

import java.util.Objects;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 HashSet底层在JDK8之前是链表加数组，JDK8之后是链表加数组加红黑树
	 每一次调用add添加方法，都会去调用hashCode方法，返回一个类似座位号的，
	 新添加的元素会根据这个座位号去决定自己在哪里
	 像调用这个hashCode这个方法的返回值，就是数组的一个索引，元素会根据返回的
	 来坐，第一个元素自然就直接坐着啦，然后后面的元素一添加，也会调用hashCode
	 返回的也是一个座位号这里给他定死了，都返回1，新添加的元素拿着座位号去一看，
	 这咋有人啊？？？ 懵了，发现有人咋办，调用重写后的equals方法，来比较内容，
	 因为咱座位号都一样啊，那咱就比内容呗，一比较发现咱内容是不一样的，那你坐我腿上吧
	 后面又有新添加的元素啦，一添加就调用hashCode方法，又返回一个一，继续去看呗，
	 我擦，咋两人，看着一个坐着人家腿上，又懵了，位置上有人，那就调用equals方法，
	 比较内容，咱两内容是不一样的啊，那我做你们两上面吧，后面又有新添加的元素
	 调用hashCode方法，返回值又是1，去坐呗，卧槽，这特么咋三个人啊，咱座位号都一样啊？
	 比内容，从第一个坐那里的开始比，发现不一样，继续跟第二个比，又不一样，再跟第三个比，
	 这次就一样了，咱咋啥都一样，得，我走，我走，终究是多余的了，就不会存储了，
	 这样就达到了去重的效果

	 这样把hashCode的返回值定死了，这样不好吧


	 因为是链表，所以这里的上面就是在添加的元素的下面挂着，而哈希表结构式链表加数组，数组又有索引，
	 那就都挂在了下面，调用equals方法，依次从那第一个开始比
*/
	@Override
	public int hashCode() {
		return age + name.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age && Objects.equals(name, student.name);
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
