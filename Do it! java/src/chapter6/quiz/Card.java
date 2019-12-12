package chapter6.quiz;

public class Card {
	
	private static int cardNum;
	public String name;
	public int card;
	
	public Card() {
		cardNum++;
		card = cardNum;
	}

	public static int getCardNum() {
		return cardNum;
	}

	public static void setCardNum(int cardNum) {
		Card.cardNum = cardNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
