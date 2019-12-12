package chapter8.witharraylist;

import java.util.ArrayList;

import chapter8.polymorphism.Custmor;
import chapter8.polymorphism.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Custmor> custmorList = new ArrayList<>();
		
		Custmor custmorLee = new Custmor(10010, "�̼���");
		Custmor custmorShin = new Custmor(10020, "�ɻ��Ӵ�");
		Custmor custmorHong = new GoldCustomer(10030, "ȫ�浿");
		Custmor custmorYoul = new GoldCustomer(10040, "��������");
		Custmor custmorKim = new VIPCustomer(10050, "������", 12345);
		
		custmorList.add(custmorLee);
		custmorList.add(custmorShin);
		custmorList.add(custmorHong);
		custmorList.add(custmorYoul);
		custmorList.add(custmorKim);
		
		System.out.println("====�� ���� ���====");
		for(Custmor custmor: custmorList) {
			System.out.println(custmor.showCustomerInfo());
		}
		
		System.out.println("==== �������� ���ʽ� ����Ʈ ��� ====");
		int price = 10000;
		for(Custmor custmor : custmorList) {
			int cost = custmor.calcPrice(price);
			System.out.println(custmor.getCustomerName() + " ����" + cost + "�� �����ϼ̽��ϴ�.");
		}

	}

}
