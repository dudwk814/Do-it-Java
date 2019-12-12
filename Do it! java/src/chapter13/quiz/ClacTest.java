package chapter13.quiz;

public class ClacTest {

	public static void main(String[] args) {
		Calc calc = (num1, num2) -> {return num1 + num2;};
		
		System.out.println(calc.add(10, 20));
	}

}
