package chapter15.stream.others;

import java.io.Console;
import java.util.Scanner;

public class ConsloeTest {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("�̸� : ");
		String name = console.readLine();
		System.out.println("����: ");
		String job = console.readLine();
		System.out.println("��й�ȣ: ");
		char[] strPass = console.readPassword();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);

	}

}
