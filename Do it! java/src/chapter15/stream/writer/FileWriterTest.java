package chapter15.stream.writer;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');	//문자 하나 출력
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요.");
			fw.write(buf, 1, 2);
			fw.write("65"); 	//숫자 그대로 출력
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
