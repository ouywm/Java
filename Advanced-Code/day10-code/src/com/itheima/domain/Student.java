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
	// 取出的顺序 : 左，中，右

	// this指的是要比较的对象的age，o.age是当前要添加的
	// 当前的对象应该是父节点，要添加的就是添加到父节点下面的，
	// 根据减去后的值，来决定在左边还是在右边
	// this.xxx - o.xxx 正序
	// o.xxx -this.xxx 倒序
	@Override
	public int compareTo(Student o) {
		// 0 表示一样的，一样的就不添加
		// 1 表示是比根节点更大的值，就比右边大了，都往右边走，输出我们看到的就是正序
		// -1 就是比根节点更小的喽，往左边走，所以我们看到的就是倒序


		// 根据年龄做主要排序，如果年龄相同姓名是次要排序
		// 定义一个age结果变量来接收
		// o.age - this.age == 0 如果这样写，那万一有同学的年龄是相同的，那就添加不了了啊
		// 就要添加新的条件，新的条件为姓名
		int ageResult = o.age - this.age;
		// 当计算出来的结果是0，就是有相同的年龄喽，这里用的是三元运算，三个表达式
		// 结果是0 就拿姓名来做比较
		int nameResult = ageResult == 0 ?  o.name.compareTo(this.name) : ageResult;
		// 会有相同姓名跟相同年龄的同学出现，如果代码走到这里的话，那我们就给他的返回值 设定 1，
		// 就可将这相同姓名和相同年龄的同学存储到集合里面的了
		int result = nameResult == 0 ? 1 : nameResult;

		return result;
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
