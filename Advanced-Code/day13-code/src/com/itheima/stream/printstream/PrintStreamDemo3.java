package com.itheima.stream.printstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo3 {
	/*
        字符打印流：
            构造方法
                public PrintWriter(Write/File/String)            关联字节输出流/文件/文件路径
                public PrintWriter(String fileName, Charset charset)    指定字符编码
                public PrintWriter(Write, boolean autoFlush)  自动刷新
                public PrintWriter(Write out, boolean autoFlush, String encoding)    指定字符编码且自动刷新
            成员方法：
                public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
                public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
                public void print(Xxx xx)           特有方法：打印任意数据，不换行
                public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换行
    */
	public static void main(String[] args) throws IOException {

		// 创建字符打印流
		PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\a.txt"));

		// 打印数据
		pw.println("今天天气也很好");
		pw.print("是吗？");
		pw.printf("%s %s", "Hello", "World");

		// 关闭流对象
		pw.close();
	}
}
