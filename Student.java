package projectSchoolManagement;

public class Student {
	private int id;
	private String name;
	private int classNo;
	private int age;
	public Student(int id, String name, int classNo, int age) {
		//super();
		this.id = id;
		this.name = name;
		this.classNo = classNo;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}


