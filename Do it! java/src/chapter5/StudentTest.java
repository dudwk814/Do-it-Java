package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.getStudentName());
		
		Student student2 = new Student();
		student2.studentName = "�Ƚ¿�";
		System.out.println(student2.getStudentName());

	}

}
