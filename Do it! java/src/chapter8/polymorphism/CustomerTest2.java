package chapter8.polymorphism;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		
		Custmor custmorLee = new Custmor();
		custmorLee.setCustimerID(10010);
		custmorLee.setCustomerName("�̼���");
		custmorLee.bonusPoint = 1000;
		
		System.out.println(custmorLee.showCustomerInfo());
		
		Custmor custmorKim = new VIPCustomer(10020, "������", 12345);
		custmorKim.bonusPoint = 1000;
		
		System.out.println(custmorKim.showCustomerInfo());
		System.out.println("==== �������� ���ʽ� ����Ʈ ��� ====");
		
		int price = 10000;
		int leePrice = custmorLee.calcPrice(price);
		int kimPrice = custmorKim.calcPrice(price);
		
		System.out.println(custmorLee.getCustomerName() + " ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(custmorLee.showCustomerInfo());
		System.out.println(custmorKim.getCustomerName() + " ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(custmorKim.showCustomerInfo());

	}

}
