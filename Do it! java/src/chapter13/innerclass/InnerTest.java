package chapter13.innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;	//���� Ŭ������ �ܺ� Ŭ�������� ������ �Ұ����ϱ� ������ ���� ���� Ŭ���� �ڷ��� ������ ���� �ϰ� �ܺ� Ŭ���� �����ڿ��� ���� Ŭ������ ����
	
	public OutClass() {
		inClass = new InClass();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //�ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����. �ܺ� Ŭ������ �����Ǿ���ϴµ� ����ƽ ����Ŭ������ �ܺ� Ŭ������ ������� ������ �� �ֱ� ����
			System.out.println("InStaticClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ���� ���");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���");
		}
		
	}
	
	class InClass {
		int iNum = 100;
		//static int sInNum = 200; �ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ��� �ܺ� Ŭ������ ���� �����ؾ� �ϱ� ������ ���� ������ ���� �޼���� ���� Ŭ�������� ���� �Ұ�����.
		
		void inTest() {
			System.out.println("OutClass num = "  + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "  + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}
public class InnerTest {

	public static void main(String[] args) {
//		OutClass outClass = new OutClass(); 	//�ܺ� Ŭ���� �����ڿ��� ���� Ŭ������ �����ϱ� ������ ���� Ŭ������ ���� �������
//		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
//		outClass.usingClass();
		
		
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �ι� �޼��� ȣ��");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("���� ���� Ŭ���� ���� �޼��� ȣ��");
		sInClass.sTest();
	}

}
