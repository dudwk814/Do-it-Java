package chapter3.Ex3_1;

public class Opertation5 {

	public static void main(String[] args) {
		int num = 0B00000101;
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num <<= 2;
		System.out.println(num);
	}

}
