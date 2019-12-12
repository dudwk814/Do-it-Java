package chapter15.stream.reader;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt")) {
			int i;
			while( (i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
