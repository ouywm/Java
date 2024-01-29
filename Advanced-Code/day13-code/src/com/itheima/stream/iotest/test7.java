package com.itheima.stream.iotest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test7 {

	/*
			两个文件，一个是学生信息文件，一个是备份文件，
			先读取学生信息文件，读取到文件中，然后判断集合是否为空
			如果集合为空就代表，文件是空的了，因为初始文件都是空的了
			所以就得去读取备份文件，把备份文件李的数据给弄到初始文件中
			读取备份文件放到集合，然后再从集合读取数据写到初始文件中
			之后再删除备份文件

			如果不为空，打乱集合中的顺序，删除集合中0号索引的元素，再打印出来被删除的这同学信息
			因为打了集合顺序，获取第一个就是随机的
			然后再把打乱了顺序，删除了学生信息的集合，给写到初始文件中，不开启追加写入模式
			这样就会清空文件内容，将集合中的数据写入

			把删除的学生写到备份文件中，删除一个写一个，这样就达到了随机点名但是不会点到相同的学生
			之后，如果初始文件中的数据都被读取出到集合中，然后删除集合中元素，再次写入，已经空了
			就读取备份文件，把备份文件中的数据写到集合中，然后将这个装满数据的备份集合，给写到初始文件中
			再删除备份文件，字符输出流，如果没有该文件会自动创建，这样就不要再去删除备份文件中的数据了

	 */
	public static void main(String[] args) throws IOException {
		// 原始文件路径
		String src = "D:\\A.txt";
		// 备份文件路径，开始为空
		String backups = "D:\\B.txt";
		// 读取原始文件
		ArrayList<String> list = readFile(src);
		// 判断集合是否为空，如果为空，就说明，原始文件是空的
		if (list.isEmpty()) {
			// 读取备份文件
			list = readFile(backups);
			// 把备份文件写到初始文件中
			writeFile(src, list, false);
			// 删除备份文件
			new File(backups).delete();
		}
		// 代码走到这说明原始文件还有数据
		// 打乱集合
		Collections.shuffle(list);
		// 删除0号索引，
		String stuInfo = list.remove(0);
		// 打印被点到的学生
		System.out.println("当前被点到的学生" + stuInfo);
		// 把删除之后所有的学生信息，写到初始文件中
		writeFile(src, list, false);
		// 把删除的学生信息备份，写到备份文件中
		writeFile(backups, stuInfo, true);
	}

	private static void writeFile(String backups, String stuInfo, boolean isAppend) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(backups, isAppend));
		bw.write(stuInfo);
		bw.newLine();
		bw.close();
	}

	/**
	 * 作用：写出集合中的数据
	 * 形参一：要把数据写到哪里，表示文件路径
	 * 形参二：有数据的集合，把这个集合中的数据写到文件中
	 * 形参三：是否支架写入
	 */
	private static void writeFile(String pathFile, ArrayList<String> list, boolean isAppend) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile, isAppend));
		for (String str : list) {
			bw.write(str);
			bw.newLine();
		}
		bw.close();
	}


	/**
	 * 作用：根据传入的形参一，读取这个文件将读取到的数据添加到集合中
	 * 形参一：文件路径，表示要读取的文件路径
	 * 返回值：返回一个装满数据的集合
	 */
	private static ArrayList<String> readFile(String src) throws IOException {
		ArrayList<String> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader(src));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		return list;
	}
}
