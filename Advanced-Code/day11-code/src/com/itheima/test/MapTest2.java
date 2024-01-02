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
		Collections.addAll(list1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
		hm.put("江苏省", list1);

		ArrayList<String> list2 = new ArrayList<String>();
		Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
		hm.put("湖北省", list2);

		ArrayList<String> list3 = new ArrayList<String>();
		Collections.addAll(list3, "成都市","绵阳市", "自贡市", "攀枝花市", "泸州市");
		hm.put("四川省", list3);

		StringBuilder sb = new StringBuilder();

	}
}
