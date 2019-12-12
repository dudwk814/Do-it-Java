package chapter11.string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); 	//str1 과 str2는 서로 다른 인스턴스이기 때문에 주소가 달라서 false를 반환
		System.out.println(str1.equals(str2)); 	//str1과 str2는 문자열이 같으므로 논리적으로 같기 때문에 true를 반환 String클래스는 eqauls메서드를 재정의하여 사용
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);  //같은 상수풀 주소를 가리키기 때문에 true를 반환
		System.out.println(str3.equals(str4));	//논리적으로 같은 문자열이기 때문에 true를 반환

	}

}
