package chapter9.abstractex;

public abstract class Computer {	//�߻� Ŭ����

	public abstract void display();	//�߻� �޼���
	public abstract void typing();		//�߻� �޼���
	
	public void turnOn() {		//�Ϲ� �޼���
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {		//�Ϲ� �޼���
		System.out.println("������ ���ϴ�.");
	}
	
}
