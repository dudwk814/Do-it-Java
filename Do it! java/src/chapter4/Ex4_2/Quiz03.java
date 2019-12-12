package chapter4.Ex4_2;

public class Quiz03 {

	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				if(i <= j) {
					break;
				}
			System.out.println(i + " X " + j + " = "  + (i * j));
			}
		}

	}

}
