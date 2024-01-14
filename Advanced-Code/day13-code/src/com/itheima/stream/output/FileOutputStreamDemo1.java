package com.itheima.stream.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

	/*

			字节流写出数据：

				构造方法：
					1.public FileOutputStream(String name) : 输出流关联文件，文件路径以字符串形式给出
					2.FileOutputStream(File file) : 输出流关联文件，文件路径一File对象形式给出


				成员方法 ：

					public void write(int i ) : 写出一个字节
					public void write(byte[] bys) : 写出一个字节数组


				细节 ：
					输出流关联文件吗，文件如果不存在，会自动创建出来
								如果文件存在：会清空现有的内容，然后在进行写入操作

					流对象使用完毕之后，要调用close关闭流方法，不然会占用资源
	 */
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\A.txt", true);
		fos.write(97);

		byte[] bytes = {97, 98, 99};
		// 写入数据
		fos.write(bytes);
		// 调用String的getBytes方法，将字符转换成byte数组
		fos.write("这是io流".getBytes());

		fos.write(bytes,1,2);

		// 关闭流
		fos.close();
	}
}
