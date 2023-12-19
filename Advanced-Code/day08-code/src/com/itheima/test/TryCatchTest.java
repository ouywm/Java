package com.itheima.test;

import com.itheima.doma.Student;

import java.util.Scanner;

/**
 * @author a
 * @date 2023/12/10
 */
public class TryCatchTest {
	/*
		需求 ： 键盘录入学生的姓名和年龄，封装为Student学生对象
	 */
	public static void main(String[] args) {

		Student stu = new Student();

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入学生的姓名:");
		String name = sc.nextLine();
		stu.setName(name);

		System.out.println("请输入学生的年龄:");
		int age = 0;

		while (true) {
			try {
				age = Integer.parseInt(sc.nextLine());
				stu.setAge(age);
				break;
			} catch (NumberFormatException e) {
				System.out.println("您的年龄输入有误，请重新输入整数年龄:");
			} catch (Exception e) {
				String message = e.getMessage();
				System.out.println(message);
			}
		}
		System.out.println(stu);
	}
}
