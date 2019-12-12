package chapter8.inheritance;

public class OverrideingTest1 {

	public static void main(String[] args) {
		Custmor customerLee = new Custmor(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ customerKim.calcPrice(price) + "원입니다.");
		
//		System.out.println(customerKim.bonusPoint);
	}

}
