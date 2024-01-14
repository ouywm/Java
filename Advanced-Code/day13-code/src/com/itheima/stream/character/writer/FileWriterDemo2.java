package com.itheima.stream.character.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	/*
			注意事项：字符输出流写出数据，需要调用flush或close方法，数据才会写出，

				flush() : 输出数据，刷出后可以继续写出
				close() : 关闭流释放资源，顺便刷出数据，关闭后不可以继续写出

			他也有内置数组，大小为1024个大小，在写操作的时候，写不是直接写出去，而是先会写到内置数组当中，不调用上面这两个方法，数据就出不去
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\D.txt");
		fw.write("人活一世，草木一秋");
	}
}
