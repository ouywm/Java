package com.itheima.hashset;

public class StringDemo {
	/*
		问题 ： 该如何重写hashCode方法?
		回答 : 应该将类的索引属性，参与到哈希值的计算当中
				只有这样做,(哈希值冲突)的概率，才会比较小

		我们在打印对象名的时候，在没有重写toString方法的时候，会打印一个地址值，
		这个地址值像下面这个toString，没有被重写的时候是这样的

		public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            // 全类名+@+通过Integer调用toHexString(传值hashCode()方法，返回一个值)，转换成十六进制所谓的地址值
            //本质来讲就是一个哈希值
        }

        重写之后，我们打印的就不是地址值了
	 */

	public static void main(String[] args) {

		//String类重写过hashCode方法，是根据字符串的每一个字符进行计算

		System.out.println("通话".hashCode());

		System.out.println("重地".hashCode());

		// 但是也会有相同的哈希值出现，就要加上equals方法比较内容
	}
}
