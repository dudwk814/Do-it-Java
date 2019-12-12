package chapter15.stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true)){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data ++;
			}
			fos.write(bs); 		//�迭�� �Ѳ����� ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
