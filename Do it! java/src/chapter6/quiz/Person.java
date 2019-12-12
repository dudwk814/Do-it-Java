package chapter6.quiz;

public class Person {

	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBuel(Buel buel) {
		buel.take(4000);
		this.money -= 4000;
	}
	
	public void takeKong(Kong kong) {
		kong.take(4500);
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(name + "¥‘¿« ≥≤¿∫ µ∑¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
