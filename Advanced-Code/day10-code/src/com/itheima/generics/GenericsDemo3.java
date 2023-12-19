package com.itheima.generics;

public class GenericsDemo3 {
	/*
		泛型方法 :

				1.非静态的方法 : 内部的泛型，会根据类的泛型做匹配
						在没创建对象之前，是不确定泛型的类型，在创建对象的时候，给了具体的类型，所以就知道了自己是啥类型
						跟着类走


				2.静态方法 : 静态方法中如果加入了泛型，必须声明出自己独立的泛型
						因为啥，静态方法在类的字节码加载之前就已经加载好了，就是在类的创建对象之前就已经存在了
						所以给跟着类的泛型还有用吗？没有了啊，该换大哥了，自己声明出了一个独立的泛型，自己干大事，
						那么它在什么时候确定类型呢？在调用方法的时候，根据值的类型做匹配

							-- 时机 : 在调用方法的时候，传入实际的参数，来确定到具体的类型

				注意 : 泛型都是引用类型
	 */
	public static void main(String[] args) {

		String[] arr1 = {"张三", "李四", "王五"};
		Integer[] arr2 = {11, 22, 33};
		Double[] arr3 = {11.1, 22.2, 33.3};

		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}

	public static <T> void printArray(T[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1] + "]");
	}
}
