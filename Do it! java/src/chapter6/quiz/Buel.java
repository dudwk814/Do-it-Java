package chapter6.quiz;

public class Buel {

	String name;
	int money; //����
	int count; //�մ� ��
	
	public Buel(String name) {
		this.name = name;
	}
	
	public void take(int money) {
		this.money += money;
		count ++;
	}
	
	public void showInfo() {
		System.out.println(name + "�� ������ " + money + "�̰� �մ��� " + count + "�� �Դϴ�.");
	}
	
}
