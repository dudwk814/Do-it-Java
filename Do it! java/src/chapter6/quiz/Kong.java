package chapter6.quiz;

public class Kong {

	String name = "��ٹ�";
	int money; //����
	int count; //�մ� ��
	
	public Kong(String name) {
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
