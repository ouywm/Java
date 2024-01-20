package com.itheima.stream.zipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
	/*

	 */
	public static void main(String[] args) {
		File src = new File("D:\\test");

		File dest = new File("D:\\");
	}

	public static void getZip(File src, File dest) throws IOException {
		// 解压缩的本质：把压缩包里面的每一个文件或者文件夹读取出来，按照层级关系靠诶到目的地当中
		// 创建一个解压缩流用来读取压缩包中的数据
		ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
		// 获取压缩包中的每一个ZipEntry对象
		// 表示压缩包中的文件或者文件夹
		ZipEntry entry;
		while ((entry = zip.getNextEntry()) != null) {
			if (entry.isDirectory()) {
				// 如果是文件夹，需要在目的地创建一个文件夹，参数为父级路径，子级路径名称
				File file = new File(dest, entry.getName());
				// 没有就创建
				file.mkdirs();
			} else {
				// 文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中(按照层级关系存放)
				FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()));

				int i;
				while ((i = zip.read()) != -1) {
					fos.write(i);
				}
				fos.close();
				// 表示在压缩包中的一个文件处理完毕了
				zip.closeEntry();
			}
		}
		zip.close();
	}
}
