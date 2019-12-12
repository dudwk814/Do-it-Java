package chapter8.inheritance;

public class OverrideingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		Custmor custmorLee = new Custmor(10010, "이순신");
		System.out.println(custmorLee.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ custmorLee.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ customerKim.calcPrice(price) + "원입니다.");
		
		Custmor vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ vc.calcPrice(price) + "원입니다.");
		
//		System.out.println(customerKim.bonusPoint);
	}

}
