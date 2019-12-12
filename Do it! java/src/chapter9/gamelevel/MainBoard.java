package chapter9.gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
//		AdvancedLevel aLevel = new AdvancedLevel();
//		player.upgradeLevel(aLevel);
		player.upgradeLevel(new AdvancedLevel());
		player.play(2);
		
		player.upgradeLevel(new SuperLevel());
		player.play(3);
	}

}
