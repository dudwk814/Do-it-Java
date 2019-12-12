package chapter9.gamelevel;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {	//���ø� �޼��� final ���� �ٿ� ���� Ŭ�������� ���������� ���ϰ� ���Ƶ�
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
