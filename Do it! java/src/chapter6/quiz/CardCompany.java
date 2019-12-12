package chapter6.quiz;

public class CardCompany {

	private static int cardNum;
	public String name;
	public int card;
	
	public CardCompany() {
		cardNum++;
		card = cardNum;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static int getCardNum() {
		return cardNum;
	}
	
	public static void setCardNum(int cardNum) {
		CardCompany.cardNum = cardNum;
		
	}
	
}
