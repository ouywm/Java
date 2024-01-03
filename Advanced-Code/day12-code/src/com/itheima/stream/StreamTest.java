package com.itheima.stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
	/*
		现在有两个 ArrayList 集合，分别存储6名男演员和6名女演员，要求完成如下的操作：
			1. 男演员只要名字为3个字的前两人
			2. 女演员只要姓林的，并且不要第一个
			3. 把过滤后的男演员姓名和女演员姓名合并到一起
			4. 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
			5. 演员类Actor, 里面有一个成员变量, 一个带参构造方法，以及成员变量对应的get/set方法
	 */
	public static void main(String[] args) {

		ArrayList<String> manList = new ArrayList<String>();
		manList.add("周润发");
		manList.add("成龙");
		manList.add("刘德华");
		manList.add("吴京");
		manList.add("周星驰");
		manList.add("李连杰");

		ArrayList<String> womanList = new ArrayList<String>();
		womanList.add("林心如");
		womanList.add("张曼玉");
		womanList.add("林青霞");
		womanList.add("柳岩");
		womanList.add("林志玲");
		womanList.add("王祖贤");

		Stream<String> man = manList.stream().filter(m -> m.length() == 3).limit(2);
		Stream<String> woman = womanList.stream().filter(w -> w.startsWith("林")).skip(1);
		Stream<String> manWoman = Stream.concat(man, woman);
		manWoman.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				Actor a = new Actor(name);
				System.out.println(a);
			}
		});
	}
}

class Actor {
	private String name;

	public Actor() {
	}

	public Actor(String name) {
		this.name = name;
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

	public String toString() {
		return "Actor{name = " + name + "}";
	}
}