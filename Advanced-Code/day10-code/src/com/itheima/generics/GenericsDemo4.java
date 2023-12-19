package com.itheima.generics;

public class GenericsDemo4 {
	/*
		泛型接口
	 */

	public static void main(String[] args) {



	}
}
interface Inter<E>{
	void show(E e);
}

class InterAImpl implements Inter<String>{
	@Override
	public void show(String s) {

	}
}