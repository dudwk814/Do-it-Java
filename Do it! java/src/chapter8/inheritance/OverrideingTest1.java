package chapter8.inheritance;

public class OverrideingTest1 {

	public static void main(String[] args) {
		Custmor customerLee = new Custmor(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		
		System.out.println(customerLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� "
				+ customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� "
				+ customerKim.calcPrice(price) + "���Դϴ�.");
		
//		System.out.println(customerKim.bonusPoint);
	}

}