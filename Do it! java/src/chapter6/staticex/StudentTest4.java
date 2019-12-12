package chapter6.staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.studentName + " 학번 : " + studentSon.studentID);

	}

}
