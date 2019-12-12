package chapter15.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("a.txt");
			 OutputStreamWriter osw = new OutputStreamWriter(fos)){
			
			osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");

	}

}
