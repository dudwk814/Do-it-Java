package chapter6.staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student4 studentLee = new Student4();
		studentLee.setStudentName("������");
		System.out.println(studentLee.studentCard);
		System.out.println(studentLee.getStudentName());
		
		Student4 studentSon = new Student4();
		studentSon.setStudentName("������");
		System.out.println(studentSon.studentCard);
		System.out.println(studentSon.getStudentName());

	}

}
