package com.itheima.generics;

public class GenericsDemo4 {
	/*
		泛型接口

				1.实现类，实现接口的时候确定到接口的具体类型
				2.实现类实现接口，没有指定具体类型，就让接口的泛型，跟着类的泛型去匹配
	 */

	public static void main(String[] args) {
		InterBImpl<String> i = new InterBImpl<>();

	}
}
//泛型接口
interface Inter<E> {
	void show(E e);
}

//实现类想好给什么类型了
class InterAImpl implements Inter<String> {
	@Override
	public void show(String s) {

	}
}

//实现类也没想好要给什么类型，那就到创建对象的时候再给类型吧,没想好那就跟着类的泛型走
class InterBImpl<E> implements Inter<E> {
	@Override
	public void show(E e) {

	}
}