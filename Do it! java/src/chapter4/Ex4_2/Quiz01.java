package chapter4.Ex4_2;

public class Quiz01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		} else if(operator == '-') {
			System.out.println(num1 - num2);
		} else if(operator == '*') {
			System.out.println(num1 * num2);
		} else if(operator == '/') {
			System.out.println(num1 / num2);
		} 
		
		
		switch(operator) {
			case '+' : System.out.println(num1 + num2);
				break;
			case '-' : System.out.println(num1 - num2);
				break;
			case '*' : System.out.println(num1 * num2);
				break;
			case '/' : System.out.println(num1 / num2);
				break;
		}



	}

}
