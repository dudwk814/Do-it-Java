package chapter11.object;

class Student {
	String studentName;
	int studentID;
	
	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return studentName + ", " + studentID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}
}
public class StudentEx {

	public static void main(String[] args) {
		Student studentLee = new Student("이상원", 10001);
		Student studentLee2 = studentLee;
		Student studentSang = new Student("이상원", 10001);
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 같지않습니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else 
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang) 
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentSang의 주소는 같지않습니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다.");
		else 
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
	}

}
