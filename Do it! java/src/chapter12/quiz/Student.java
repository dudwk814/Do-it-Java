package chapter12.quiz;

import chapter12.collection.Member;

public class Student{

	private String studentId;
	private String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	@Override
	public String toString() {
		return studentId+","+studentName;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student)obj;
//			if(this.studentId == student.studentId) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//		return false;
//	}
	
	

//
//	@Override
//	public int compareTo(Student student) {
//		return this.studentId.compareTo(student.studentId);
//	}
}
