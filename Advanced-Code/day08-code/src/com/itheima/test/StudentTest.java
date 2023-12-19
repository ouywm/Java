package com.itheima.test;

import java.util.Scanner;

/**
 * @author a
 */
public class StudentTest {

	/*
			键盘录入三个学生的信息，全部输入完毕之后显示信息，输入错误，输入给予提示
			自定义异常
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 创建三个 StudentTwo 对象
		StudentTwo stu1 = new StudentTwo();
		StudentTwo stu2 = new StudentTwo();
		StudentTwo stu3 = new StudentTwo();

		// 输入第一个学生的信息，根据传入的学生对象，操作哪个对象
		inputStudentData(stu1);


		// 输入第一个学生的信息，根据传入的学生对象，操作哪个对象
		inputStudentData(stu2);

		// 输入第一个学生的信息，根据传入的学生对象，操作哪个对象
		inputStudentData(stu3);

		// 打印所有三个学生的详细信息
		System.out.println("学生1信息：" + stu1);
		System.out.println("学生2信息：" + stu2);
		System.out.println("学生3信息：" + stu3);

	}

	private static void inputStudentData(StudentTwo student) {
		System.out.println("请输入学生的姓名:");
		String name = sc.nextLine();
		student.setName(name);

		// 输入学生的年龄
		int age;
		while (true) {
			try {
				System.out.println("请输入学生的年龄:");
				age = Integer.parseInt(sc.nextLine());
				student.setAge(age);
				break; // 如果成功设置年龄，则退出循环
			} catch (StudentOneException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("请输入正确格式的年龄！");
			}
		}

		// 输入学生的数学成绩
		int mathScore;
		while (true) {
			try {
				System.out.println("请输入学生的数学成绩:");
				mathScore = Integer.parseInt(sc.nextLine());
				student.setMathScore(mathScore);
				break; // 如果成功设置数学成绩，则退出循环
			} catch (StudentOneException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("请输入正确格式的数学成绩！");
			}
		}

		// 输入学生的语文成绩
		int chineseScore;
		while (true) {
			try {
				System.out.println("请输入学生的语文成绩:");
				chineseScore = Integer.parseInt(sc.nextLine());
				student.setChineseLanguageAchievement(chineseScore);
				break; // 如果成功设置语文成绩，则退出循环
			} catch (StudentOneException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("请输入正确格式的语文成绩！");
			}
		}

		// 输入学生的英语成绩
		int englishScore;
		while (true) {
			try {
				System.out.println("请输入学生的英语成绩:");
				englishScore = Integer.parseInt(sc.nextLine());
				student.setEnglishAchievement(englishScore);
				break; // 如果成功设置英语成绩，则退出循环
			} catch (StudentOneException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("请输入正确格式的英语成绩！");
			}
		}
	}
}
