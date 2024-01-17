public class Student {
	/**
	 * id
	 */
	private String id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;
	/**
	 * 住址
	 */
	private String HomeAddress;

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student{" +
				       "id='" + id + '\'' +
				       ", name='" + name + '\'' +
				       ", age=" + age +
				       ", HomeAddress='" + HomeAddress + '\'' +
				       '}';
	}

	public Student() {
	}

	public Student(String id, String name, int age, String homeAddress) {
		this.id = id;
		this.name = name;
		this.age = age;
		HomeAddress = homeAddress;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHomeAddress() {
		return HomeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}
}
