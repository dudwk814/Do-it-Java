package chapter11.string;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); 	//str1 �� str2�� ���� �ٸ� �ν��Ͻ��̱� ������ �ּҰ� �޶� false�� ��ȯ
		System.out.println(str1.equals(str2)); 	//str1�� str2�� ���ڿ��� �����Ƿ� �������� ���� ������ true�� ��ȯ StringŬ������ eqauls�޼��带 �������Ͽ� ���
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);  //���� ���Ǯ �ּҸ� ����Ű�� ������ true�� ��ȯ
		System.out.println(str3.equals(str4));	//�������� ���� ���ڿ��̱� ������ true�� ��ȯ

	}

}
