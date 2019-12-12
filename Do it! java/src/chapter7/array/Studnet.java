package chapter7.array;

public class Studnet {
	private int studentID;
	private String name;
	
	public Studnet() {
		// TODO Auto-generated constructor stub
	}
	
	public Studnet(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

}
