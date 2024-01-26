package com.itheima.stream.iotest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class test2 {
	/*
		利用糊涂包生成假数据，写到文件中
	 */
	public static void main(String[] args) {
		// 定义变量记录网址
		String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
		String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
		String girNameNet = "http://www.haoming8.cn/baobao/7641.html";

		// 爬取数据
		String familyNameStr = HttpUtil.get(familyNameNet);
		String boyNameStr = HttpUtil.get(boyNameNet);
		String girNameStr = HttpUtil.get(girNameNet);

		// 通过正则表达式，把其中符合要求的数据获取出来
		List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
		List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
		List<String> girNameTempList = ReUtil.findAll("(.. ){4}", girNameStr, 0);

		// 处理数据 familyNameTempList(姓氏)
		// 把每一个姓氏拆开并添加到一个新的集合当中
		ArrayList<String> familyNameList = new ArrayList<>();
		for (String str : familyNameTempList) {
			for (int i = 0; i < str.length(); i++) {
				familyNameList.add(str.charAt(i) + "");
			}
		}

		// 处理数据 boyNameNameTempList(男生的名字)
		// 处理方案(去掉重复的)
		ArrayList<String> boyNameList = new ArrayList<>();
		for (String str : boyNameTempList) {
			if (!boyNameList.contains(str)) {
				boyNameList.add(str);
			}
		}

		// 处理数据 girNameTempList(女生的名字)
		// 处理方案 把里面每一个元素用空格进行切割，得到每一个女生的名字
		ArrayList<String> girNameList = new ArrayList<>();
		for (String str : girNameTempList) {
			String[] arr = str.split(" ");
			for (String string : arr) {
				girNameList.add(string);
			}
		}

		//
		// 姓名(唯一) - 性别 - 年龄
		ArrayList<String> list = getInfos(familyNameList, boyNameList, girNameList, 10, 10);
		System.out.println(list);

		// 写出数据
		// 糊涂包的相对路径，不是相对于当前项目而言的，而是相对class文件而言的
		FileUtil.writeLines(list, "D:\\A.txt", "UTF-8");
	}

	/**
	 * 作用：
	 * 获取男生和女生的信息：姓名(唯一) - 性别 - 年龄
	 * 形参：
	 * 参数一：
	 * 姓氏集合
	 * 参数二：
	 * 男生姓名集合
	 * 参数三：
	 * 女生姓名集合
	 * 参数四：
	 * 要获取男生信息的个数
	 * 参数五：
	 * 要获取女生信息的个数
	 * 返回值：
	 * 装好信息的集合
	 */
	public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girNameList, int boyCount, int girlCount) {
		// 生成男生不重复的名字
		// 为了元素的唯一性，用了哈希set集合
		HashSet<String> boyhs = new HashSet<>();
		while (true) {
			// 判断集合的大小是否已经满足男生信息的个数
			if (boyhs.size() == boyCount) {
				break;
			}
			// 打乱集合中数据的顺序
			Collections.shuffle(familyNameList);
			// 打乱集合中数据的顺序
			Collections.shuffle(boyNameList);
			// 添加到集合当中
			boyhs.add(familyNameList.get(0) + boyNameList.get(0));
		}

		// 生成女生不重复的名字
		// 为了元素的唯一性，用了哈希set集合
		HashSet<String> girlhs = new HashSet<>();
		while (true) {
			// 判断集合的大小是否已经满足男生信息的个数
			if (girlhs.size() == girlCount) {
				break;
			}
			// 打乱集合中数据的顺序
			Collections.shuffle(familyNameList);
			// 打乱集合中数据的顺序
			Collections.shuffle(girNameList);
			// 添加到集合当中
			girlhs.add(familyNameList.get(0) + girNameList.get(0));
		}
		// 最终信息集合
		ArrayList<String> list = new ArrayList<>();
		Random r = new Random();
		// 生成男生信息添加到集合当中
		for (String boyName : boyhs) {
			int age = r.nextInt(10) + 18;
			list.add(boyName + "-" + "男" + "-" + age);
		}

		// 生成女生信息添加到集合当中
		for (String girName : girlhs) {
			int age = r.nextInt(8) + 18;
			list.add(girName + "-" + "女" + "-" + age);
		}
		return list;
	}
}
