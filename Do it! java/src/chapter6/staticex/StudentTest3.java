package chapter6.staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.serialNum);
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.serialNum);
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
