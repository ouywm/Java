package com.itheima.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	/*
	-----------------------------------------------------------------------------------
		public V put (K key , V value)                 添加元素(修改: 如果键已经存在，就会使用新的值，替换旧的值)
															- 有返回值，返回的就是被覆盖掉的值，没有就是null，空
		public V remove (Object key)                   根据键删除键对应元素
															- 返回被删除的键，所对应的值
		public void clear()                            移除所有键值对元素
		public boolean containsKey (Object key)        判断集合是否包含指定的键
		public boolean containsValue (Object value)    判断集合是否包含指定的值
		public boolean isEmpty()                       判断集合是否为空
		public int size()                              集合的长度，也就是集合中键值对应的个数
	-----------------------------------------------------------------------------------


	-----------------------------------------------------------------------------------
		map双列集合中，键是唯一的，而值可以有多个能重复
	 */
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		// 添加
		map.put("张三", "北京");
		map.put("李四", "上海");
		map.put("王五", "成都");

		System.out.println(map);

		// 根据键做删除
		map.remove("王五");
		System.out.println(map);

		// 判断是否为空
		System.out.println(map.isEmpty());
		// 输出长度，里面有多少个键值对
		System.out.println(map.size());

		// 判断集合中是否包含传入的键
		System.out.println(map.containsKey("李四"));
		// 判断集合中是否包含传入的值
		System.out.println(map.containsValue("成都"));

		// 清空集合中所有元素
		map.clear();

	}
}
