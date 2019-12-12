package chapter9.gamelevel;

public class Player {

	private PlayerLevel level;
	
	public Player() {	//디폴트 생성자 . 처음 생성되면 비기너레벨로 시작하며 레벨 메세지를 출력
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	//레벨 변경 메서드
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
