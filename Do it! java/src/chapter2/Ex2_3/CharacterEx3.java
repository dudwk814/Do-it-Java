package chapter2.Ex2_3;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; char형은 음수를 표현할 수 없다.
		
		System.out.println((char)a);
		System.out.println((char)b);	//알수없는 문자 ?가 출력됨
		System.out.println(a2);

	}

}
