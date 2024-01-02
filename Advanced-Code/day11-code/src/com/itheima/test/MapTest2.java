package com.itheima.test;

import java.util.*;

public class MapTest2 {
	/*
		定义一个Map集合，键同表示省份名称，值表示市，但是市会有多个。

		添加完毕后，遍历结果

		格式如下：
		江苏省=南京市，扬州市，苏州市，无锡市，常州市
		湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
		四川生=成都市，绵阳市，自贡市，攀枝花市，泸州市
	 */
	public static void main(String[] args) {

		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

		ArrayList<String> list1 = new ArrayList<String>();
		// 使用工具类，做批量添加，因为工具类都是静态方法，所以不用创建对象
		Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
		hm.put("江苏省", list1);

		ArrayList<String> list2 = new ArrayList<String>();
		// 使用工具类，做批量添加，因为工具类都是静态方法，所以不用创建对象
		Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
		hm.put("湖北省", list2);

		ArrayList<String> list3 = new ArrayList<String>();
		// 使用工具类，做批量添加，因为工具类都是静态方法，所以不用创建对象
		Collections.addAll(list3, "成都市", "绵阳市", "自贡市", "攀枝花市", "泸州市");
		hm.put("四川省", list3);

		// 获取Map集合的键值对对象，好获取键和值
		Set<Map.Entry<String, List<String>>> entrSet = hm.entrySet();
		for (Map.Entry<String, List<String>> entry : entrSet) {
			// 键 : 省份名称
			String key = entry.getKey();
			System.out.print(key + "=");
			// 值 : 多个市名
			List<String> ListValue = entry.getValue();
			// 因为要对最后一个元素做操作，所以这里先不对最后一个元素做操作
			for (int i = 0; i < ListValue.size() - 1; i++) {
				// 后面拼接一个逗号(,)
				System.out.print(ListValue.get(i) + ",");
			}
			// 这里对最后一个元素进行操作，打印就好了，最后一个元素后面没有逗号
			System.out.println(ListValue.get(ListValue.size() - 1));
		}
	}
}
