package chapter8.inheritance;

public class OverrideingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		Custmor custmorLee = new Custmor(10010, "�̼���");
		System.out.println(custmorLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� "
				+ custmorLee.calcPrice(price) + "���Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		System.out.println(customerKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� "
				+ customerKim.calcPrice(price) + "���Դϴ�.");
		
		Custmor vc = new VIPCustomer(10030, "������", 2000);
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� "
				+ vc.calcPrice(price) + "���Դϴ�.");
		
//		System.out.println(customerKim.bonusPoint);
	}

}
