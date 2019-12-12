package chapter6.cooperation;

public class Subway {

	String lineNumber;
	int passengerCount;	//½Â°´ ¼ö
	int money;  // ÀüÃ¶ ¼öÀÔ
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ " + lineNumber + "¹øÀÇ ½Â°´Àº " + passengerCount + "¸íÀÌ°í," +
				"¼öÀÔÀº " + money + "ÀÔ´Ï´Ù.");
	}
}
