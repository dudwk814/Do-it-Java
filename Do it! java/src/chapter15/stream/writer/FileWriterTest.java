package chapter15.stream.writer;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');	//���� �ϳ� ���
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�.");
			fw.write(buf, 1, 2);
			fw.write("65"); 	//���� �״�� ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
