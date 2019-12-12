package chapter6.quiz;

public class CardCompany2 {
	
	private static CardCompany2 instance = new CardCompany2();
	private CardCompany2() {}
	
	public static CardCompany2 getInstance () {
		if(instance == null) {
			instance = new CardCompany2();
		}
		
		return instance;
	}
	
	public Card creator() {
		Card card = new Card();
		return card;
	}

}
