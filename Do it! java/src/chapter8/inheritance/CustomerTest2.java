package chapter8.inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "±Ë¿ØΩ≈", 24121);
//		customerKim.setCustimerID(10020);
//		customerKim.setCustomerName("±Ë¿ØΩ≈");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
