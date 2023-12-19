package com.itheima.generics;

public class GenericsDemo2 {
	/*

		常见的泛型表示符 : E V K T

			E : Element 表示元素
			T : Type 表示类型
			K : ket 表示键
			V : Value 表示值

		泛型类 : 创建对象的时候

		我们在编写的时候，不确定要给他这个什么类型，那么就把这个问题抛给别人，就是让我们的调用者来确定
		在创建对象的时候，就可以确定泛型的类型
	 */

	public static void main(String[] args) {

		Student<String> stu = new Student<String>();


	}
}


class Student<E>{
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
}