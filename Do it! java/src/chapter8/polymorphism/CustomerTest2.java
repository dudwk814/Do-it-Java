package chapter8.polymorphism;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		
		Custmor custmorLee = new Custmor();
		custmorLee.setCustimerID(10010);
		custmorLee.setCustomerName("이순신");
		custmorLee.bonusPoint = 1000;
		
		System.out.println(custmorLee.showCustomerInfo());
		
		Custmor custmorKim = new VIPCustomer(10020, "김유신", 12345);
		custmorKim.bonusPoint = 1000;
		
		System.out.println(custmorKim.showCustomerInfo());
		System.out.println("==== 할인율과 보너스 포인트 계산 ====");
		
		int price = 10000;
		int leePrice = custmorLee.calcPrice(price);
		int kimPrice = custmorKim.calcPrice(price);
		
		System.out.println(custmorLee.getCustomerName() + " 님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(custmorLee.showCustomerInfo());
		System.out.println(custmorKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(custmorKim.showCustomerInfo());

	}

}
