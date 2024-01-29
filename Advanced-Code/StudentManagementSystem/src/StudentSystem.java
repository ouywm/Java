import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
	static Scanner sc = new Scanner(System.in);
	static boolean isBleak = true;
	static ArrayList<Student> list = new ArrayList<>();
	public static void main(String[] args) {
		while (isBleak) {
			Menu();
		}
	}
	private static void Menu() {
		System.out.println("\"-------------欢迎来到黑马学生管理系统----------------\"");
		System.out.println("1：添加学生");
		System.out.println("2：删除学生");
		System.out.println("3：修改学生");
		System.out.println("4：查询学生");
		System.out.println("5：退出");
		System.out.println("请输入您的选择:");
		String choose = sc.next();
		switch (choose) {
			case "1":
				AddStudent(list);
				break;
			case "2":
				DeleteStudent(list);
				break;
			case "3":
				UpdateStudent(list);
				break;
			case "4":
				QueryStudent(list);
				break;
			case "5":
				System.out.println("正在退出当中，请稍后！");
				isBleak = false;
				break;
			default:
				System.out.println("请确认您输入的是否正确！！");
				break;
		}
	}
	private static void UpdateStudent(ArrayList<Student> list) {
		System.out.println("请输入您要修改的学生ID：");
		String id = sc.next();
		int index = getIndex(list, id);
		if (index == -1) {
			System.out.println("要修改的Id" + id + "不存在，请重新输入！");
			return;
		}
		Student stu = list.get(index);
		System.out.println("请输入学生姓名:");
		String name = sc.next();
		System.out.println("请输入学生年龄:");
		int age = sc.nextInt();
		System.out.println("请输入学生家庭住址:");
		String HomeAddress = sc.next();
		stu.setName(name);
		stu.setAge(age);
		stu.setHomeAddress(HomeAddress);
		System.out.println("学生信息修改成功！");
	}
	private static void DeleteStudent(ArrayList<Student> list) {
		System.out.println("请输入您要删除学生的ID:");
		String id = sc.next();
		int size = list.size();
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			String sid = student.getId();
			int index = getIndex(list, id);
			if (index >= 0) {
				list.remove(index);
				System.out.println("Id为" + id + "的学生已经删除成功！");
			} else {
				System.out.println("您输入的Id有误，或不存在！删除失败");
			}
		}
	}
	private static void QueryStudent(ArrayList<Student> list) {
		if (list.isEmpty()) {
			System.out.println("当前无学生信息，请添加后再查询");
		} else {
			System.out.println("id\t\t姓名\t\t年龄\t\t\t家庭住址");
			list.iterator().forEachRemaining(stu -> {
				System.out.println(stu.getId() + '\t' + stu.getName() + '\t' + stu.getAge() + '\t' + stu.getHomeAddress());
			});
		}
	}
	private static void AddStudent(ArrayList<Student> list) {
		System.out.println("请输入学生ID:");
		String id = sc.next();
		list.forEach(stu -> {
			String oldId = stu.getId();
			if (id.equals(oldId)) {
				System.out.println("ID已经存在！,请重新输入哦！");
			}
		});
		System.out.println("请输入学生姓名:");
		String name = sc.next();
		System.out.println("请输入学生年龄:");
		int age = sc.nextInt();
		System.out.println("请输入学生家庭住址:");
		String HomeAddress = sc.next();
		list.add(new Student(id, name, age, HomeAddress));
		System.out.println("添加成功!!");
	}
	public static int getIndex(ArrayList<Student> list, String id) {
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			String sid = s.getId();
			if (sid.equals(id)) {
				return i;
			}
		}
		return -1;
	}
}