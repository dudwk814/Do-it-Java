package chapter4.Ex4_1;

public class If_elseEx1 {

	public static void main(String[] args) {
		int score = 57;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("학점은 " + grade+ "입니다!");
		} else if(score >= 80) {
			grade = 'B';
			System.out.println("학점은 " + grade+ "입니다!");
		} else if(score >= 70) {
			grade = 'C';
			System.out.println("학점은 " + grade+ "입니다!");
		} else if(score >= 60) {
			grade = 'D';
			System.out.println("학점은 " + grade+ "입니다!");
		} else {
			grade = 'F';
			System.out.println("학점은 " + grade+ "입니다!");
		}

	}

}
