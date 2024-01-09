package com.itheima.file;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class FileTest5  {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹中每种文件的个数并打印（考虑子文件夹）
            打印格式如下：
                txt:3个
                doc:4个
                jpg:6个
     */

	static HashMap<String, Integer> hm = new HashMap<>(); // 偷个小懒，应该是加到形式参数那的
	static int count = 0;       // 统计没有后缀名的文件

	public static void main(String[] args) {

		File dir = FileTest1.getDir();

		getCount(dir);

		// 遍历map集合
		hm.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String key, Integer value) {
				System.out.println(key + ":" + value + "个");
			}
		});

		// 没有后缀
		System.out.println("没有后缀的文件有" + count + "个");
	}

	public static void getCount(File dir) {
		File[] files = dir.listFiles();

		// 遍历
		for (File file : files) {
			// 判断是不是文件
			if (file.isFile()) {
				// 是文件就获取文件名
				String name = file.getName();
				// 看文件名是否包含 "."
				if (name.contains(".")) {
					// 包含 "." 就根据.做分割
					String[] split = name.split("\\.");
					//获取最后面的后缀，文件会有多个点    (比如 a.b.c.d.e)
					String type = split[split.length - 1];
					// 判断map集合中是否包含这个键
					if (!hm.containsKey(type)) {
						// 不包含就是第一次添加 键 : type    值 : 1  (第一次添加一定是1)
						hm.put(type, 1);
					} else {
						// 代码走到这里，代表集合中有，根据键找值，取出值加一，放回去
						hm.put(type, hm.get(type) + 1);
					}
				} else {
					// 都不满足就是没有后缀
					count++;
				}
			} else { // 代码走到这，代表是文件+夹
				// 先判断是不是空的，不是空
				if (file.listFiles() != null) {
					// 递归调用
					getCount(file);
				}
			}
		}
	}
}