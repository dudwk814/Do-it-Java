package chapter4.Ex4_2;

public class Quiz02 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i % 2 != 0) continue;
				System.out.println(i + " X " + j + " = "  + (i * j));
			}
		}

	}

}
