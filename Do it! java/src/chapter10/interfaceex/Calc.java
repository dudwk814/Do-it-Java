package chapter10.interfaceex;

public interface Calc {
	
	//�������̽����� ������ ������ �����ϰ������� ����� ��ȯ��
	double PI = 3.14;
	int ERROR = -99999999;
	
	
	//�������̽����� ������ �޼���� �����ϰ������� �߻�޼���� ��ȯ��
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
}
