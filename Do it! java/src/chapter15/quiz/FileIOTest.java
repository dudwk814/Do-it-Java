package chapter15.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("a.txt");
			 OutputStreamWriter osw = new OutputStreamWriter(fos)){
			
			osw.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��� �Ϸ�");

	}

}
