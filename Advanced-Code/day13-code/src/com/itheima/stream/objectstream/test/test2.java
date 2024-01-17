package com.itheima.stream.objectstream.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\D.txt"));

		 ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

		for (Student student : list) {
			System.out.println(student);
		}

		ois.close();
	}
}
