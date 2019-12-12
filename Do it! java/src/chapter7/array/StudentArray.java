package chapter7.array;

public class StudentArray {

	public static void main(String[] args) {
		Studnet[] students = new Studnet[3];
		students[0] = new Studnet(1001, "James");
		students[1] = new Studnet(1002, "Tomas");
		students[2] = new Studnet(1003, "Edward");
		
		for(int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		

	}

}
