package chapter6.quiz;

public class CardCompanyTest2 {

	public static void main(String[] args) {
		CardCompany2 company = CardCompany2.getInstance();
		Card hanaCard = company.creator();
		hanaCard.setName("�ϳ�ī��");
		Card bcCard = company.creator();
		bcCard.setName("bcī��");
		System.out.println(hanaCard.getName());
		System.out.println(hanaCard.card);
		System.out.println(bcCard.getName());
		System.out.println(bcCard.card);
	}

}
