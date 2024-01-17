package com.itheima.stream.objectstream;

import java.io.Serial;
import java.io.Serializable;


/**
 * Serializable接口里面是没有任何的抽象方法，这种被叫做"标记型接口"
 * 一旦实现了这个接口，那么表示当前的类可以被序列化
 * 理解:
 * 一个物品的合格证
 * <p>
 * 注意事项
 * 给这个类标记了之后，是可以被添序列化了，但是，在写好javabean之后，进行了修改，比如添加属性，就会报错啦，
 * 因为在序列化输出的时候，会计算出他的序列化一样的东西，去跟原来的作比较，可以看报错代码
 * <p>
 * 报错代码: local class incompatible:
 * stream classdesc serialVersionUID = -4711882096029333658,
 * local class serialVersionUID = 2481414446410598046
 * <p>
 * 意思呢就是，与本地序列号不一致，可以看做是版本号不一致，就报错了噻
 * <p>
 * 解决方案，手动指定序列号，指定之后，就不会再去计算跟获取序列号了
 */

public class Student implements Serializable {
	@Serial
	private static final long serialVersionUID = -6936304322247440514L;

//	/**
//	 * 第一个方式，有点长
//	 */
//	@Serial
//	private static final long serialVersionUID = 1L;


	// transient : 瞬态关键字
	// 作用 : 不会把当前属性序列化到本地文件
	private transient String address;
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age, String address) {
		this.address = address;
		this.name = name;
		this.age = age;
	}

	/**
	 * 获取
	 *
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置
	 *
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
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
		return "Student{ address = " + address + ", name = " + name + ", age = " + age + "}";
	}
}
