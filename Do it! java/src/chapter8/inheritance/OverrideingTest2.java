package chapter8.inheritance;

public class OverrideingTest2 {

	public static void main(String[] args) {
		Custmor vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + " 님이 질불해야 하는 금액은 "
				+ vc.calcPrice(10000) + "원입니다.");
		
//		System.out.println(customerKim.bonusPoint);
	}

}
