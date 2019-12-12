package chapter9.gamelevel;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {	//템플릿 메서드 final 예약어를 붙여 하위 클래스에서 재정의하지 못하게 막아둠
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
