package chapter8.witharraylist;

import java.util.ArrayList;

import chapter8.polymorphism.Custmor;
import chapter8.polymorphism.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Custmor> custmorList = new ArrayList<>();
		
		Custmor custmorLee = new Custmor(10010, "이순신");
		Custmor custmorShin = new Custmor(10020, "심사임당");
		Custmor custmorHong = new GoldCustomer(10030, "홍길동");
		Custmor custmorYoul = new GoldCustomer(10040, "율곡이이");
		Custmor custmorKim = new VIPCustomer(10050, "김유신", 12345);
		
		custmorList.add(custmorLee);
		custmorList.add(custmorShin);
		custmorList.add(custmorHong);
		custmorList.add(custmorYoul);
		custmorList.add(custmorKim);
		
		System.out.println("====고객 정보 출력====");
		for(Custmor custmor: custmorList) {
			System.out.println(custmor.showCustomerInfo());
		}
		
		System.out.println("==== 할인율과 보너스 포인트 계산 ====");
		int price = 10000;
		for(Custmor custmor : custmorList) {
			int cost = custmor.calcPrice(price);
			System.out.println(custmor.getCustomerName() + " 님이" + cost + "원 지불하셨습니다.");
		}

	}

}
