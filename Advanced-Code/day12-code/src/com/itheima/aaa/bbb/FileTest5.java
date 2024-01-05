package com.itheima.aaa.bbb;

import com.itheima.file.FileTest1;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class FileTest5 {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹中每种文件的个数并打印（考虑子文件夹）
            打印格式如下：
                txt:3个
                doc:4个
                jpg:6个
     */

	static HashMap<String, Integer> hm = new HashMap<>();
	static int count = 0;       // 统计没有后缀名的文件

	public static void main(String[] args) {

		File dir = FileTest1.getDir();

		getCount(dir);

		hm.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String key, Integer value) {
				System.out.println(key + ":" + value + "个");
			}
		});

		System.out.println("没有后缀名文件的个数为:" + count);

	}

	public static void getCount(File dir) {

		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				// 获取文件名
				// 该死的,等号后面写了个dir.getName
				String fileName = file.getName();
				// 会遇到一个问题，没有后缀名的文件咋整？？
				// 做判断，判断文件名是否包含.
				if (fileName.contains(".")) {// 如果包含就做切割处理
					// 根据文件名中的.做分割，要他的一号索引位置，
					// 0号索引是文件名字，1号索引才是文件后缀，拿个字符串做接收
					// 但是会发现文件当中会有多个. 比如a.b.c.e 有这么多的.
					// 那就先做分割，存储到数组当中
					String[] sArr = fileName.split("\\.");
					// 取数组长度的最后一位，就是长度-1，用变量来接收
					String type = sArr[sArr.length - 1];
					// 里面不包含这玩意，就是第一次添加
					if (!hm.containsKey(type)) {
						// 调用put方法添加，键 : type 值 : 1 第一次添加所以是一
						hm.put(type, 1);
					} else {
						// 代码走到这，那就说明不是第一次添加，调用put方法添加
						// 键 : type 值 : 调用get方法，根据键找值，把旧值取出来加一然后放回去
						hm.put(type, hm.get(type) + 1);
					}
				} else {
					// 没有后缀名，单独统计
					count++;
				}
			} else {
				// 代码走到这了，就是文件夹呗，
				// 不过先判断是不是空的
				if (file.listFiles() != null) {
					// 不是空的就递归调用
					getCount(file);
				}
			}
		}
	}
}
