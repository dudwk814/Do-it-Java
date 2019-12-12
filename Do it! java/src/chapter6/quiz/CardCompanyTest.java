package chapter6.quiz;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany card1 = new CardCompany();
		card1.setName("하나카드");
		System.out.println(card1.getName());
		System.out.println(card1.card);
		
		CardCompany card2 = new CardCompany();
		card2.setName("bc카드");
		System.out.println(card2.getName());
		System.out.println(card2.card);

	}

}
