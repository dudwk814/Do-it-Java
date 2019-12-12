package chapter6.cooperation;

public class Taxi {
	int taxiNum;
	int money;  // 버스 수입
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(taxiNum + "의 수입은 " + money + "입니다.");
	}

}
