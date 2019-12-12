package chapter15.stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
