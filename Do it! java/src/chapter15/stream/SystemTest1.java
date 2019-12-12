package chapter15.stream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) throws IOException{
		int i;
		try {
			System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
			i = System.in.read();	//바이트 단위로 읽음
			System.out.println(i); //입력한 알파벳의 아스키코드를 출력
			System.out.println((char)i); //문자로 변환하여 출력
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
