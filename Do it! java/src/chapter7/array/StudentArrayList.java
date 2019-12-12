package chapter7.array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Studnet> studentList = new ArrayList<>();
		studentList.add(new Studnet(1001, "James"));
		studentList.add(new Studnet(1002, "Tomas"));
		studentList.add(new Studnet(1003, "Edward"));
		
		for(Studnet student: studentList) {
			student.showStudentInfo();
		}

	}

}
