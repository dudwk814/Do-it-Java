package chapter15.stream.others;

import java.io.Console;
import java.util.Scanner;

public class ConsloeTest {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("이름 : ");
		String name = console.readLine();
		System.out.println("직업: ");
		String job = console.readLine();
		System.out.println("비밀번호: ");
		char[] strPass = console.readPassword();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);

	}

}
