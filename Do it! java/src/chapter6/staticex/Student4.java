package chapter6.staticex;

public class Student4 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int studentCard;
	
	public Student4() {
		serialNum ++;
		studentID = serialNum;
		studentCard = studentID + 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student4.serialNum = serialNum;
	}
	
	

}
