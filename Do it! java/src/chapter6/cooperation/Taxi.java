package chapter6.cooperation;

public class Taxi {
	int taxiNum;
	int money;  // ���� ����
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiNum + "�� ������ " + money + "�Դϴ�.");
	}

}
