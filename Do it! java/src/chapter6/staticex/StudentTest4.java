package chapter6.staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("������");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);

	}

}
