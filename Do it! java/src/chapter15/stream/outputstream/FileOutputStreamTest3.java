package chapter15.stream.outputstream;

import java.io.FileOutputStream;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output3.txt", true)){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data ++;
			}
			fos.write(bs, 2, 10); 		//배열의 3번째 위치부터 10개 바이트 출력
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
