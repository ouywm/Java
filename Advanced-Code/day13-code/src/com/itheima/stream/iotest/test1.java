package com.itheima.stream.iotest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	/*
         制造假数据：
             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */
	public static void main(String[] args) throws IOException {

		// 定义变量记录网址
		String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
		String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
		String girNameNet = "http://www.haoming8.cn/baobao/7641.html";


		String familyNameStr = webCrawler(familyNameNet);
		String boyNameStr = webCrawler(boyNameNet);
		String girNameStr = webCrawler(girNameNet);

		// 通过正则表达式，把其中符合要求的数据获取出来
		ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})(，|。)", 1);
		ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
		ArrayList<String> girNameTempList = getData(girNameStr, "(.. ){4}", 0);

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
		System.out.println(girNameList);

	}

	/**
	 * 作用：
	 * 根据正则表达式获取字符串中的数据
	 * 参数一：
	 * 完整的字符串
	 * 参数二：
	 * 正则表达式
	 * 返回值：
	 * 真正想要的数据
	 */
	private static ArrayList<String> getData(String str, String regex, int index) {
		// 创建集合用来存放数据
		ArrayList<String> list = new ArrayList<String>();
		// 按照正则表达式的规则，去获取数据
		Pattern pattern = Pattern.compile(regex);
		// 按照pattern规则，到str当中去获取数据
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			list.add(matcher.group(index));
		}
		// 返回集合，里面已经存放好数据了
		return list;
	}

	/**
	 * 作用：
	 * 从网络中爬取数据，把数据拼接成字符串返回
	 * 参数一：
	 * 网址
	 * 返回值：
	 * 爬取到的所有数据
	 */
	public static String webCrawler(String net) throws IOException {
		// 创建StringBuilder对象，准备拼接爬取到的数据
		StringBuilder sb = new StringBuilder();
		// 创建URL对象
		URL url = new URL(net);
		// 得到连接对象
		URLConnection conn = url.openConnection();
		// 读取数据
		InputStreamReader isr = new InputStreamReader(conn.getInputStream());

		int i;
		while ((i = isr.read()) != -1) {
			sb.append((char) i);
		}
		// 关流
		isr.close();
		return sb.toString();
	}
}