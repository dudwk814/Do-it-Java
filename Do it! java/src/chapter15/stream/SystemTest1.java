package chapter15.stream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) throws IOException{
		int i;
		try {
			System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
			i = System.in.read();	//����Ʈ ������ ����
			System.out.println(i); //�Է��� ���ĺ��� �ƽ�Ű�ڵ带 ���
			System.out.println((char)i); //���ڷ� ��ȯ�Ͽ� ���
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
