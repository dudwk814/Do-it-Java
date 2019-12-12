package chapter6.quiz;

public class Kong {

	String name = "콩다방";
	int money; //수입
	int count; //손님 수
	
	public Kong(String name) {
		this.name = name;
	}
	
	public void take(int money) {
		this.money += money;
		count ++;
	}
	
	public void showInfo() {
		System.out.println(name + "의 수입은 " + money + "이고 손님은 " + count + "명 입니다.");
	}
	
}
