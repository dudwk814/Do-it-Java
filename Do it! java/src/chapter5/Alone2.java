package chapter5;

public class Alone2 {

	long orderNum;
	String orderID;
	String orderDate;
	String name;
	String goodsNum;
	String address;
	
	
	public static void main(String[] args) {
		
		Alone2 order = new Alone2();
		order.orderNum = 201803120001L;
		order.orderID = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.goodsNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNum);
		System.out.println("�ֹ��� ���̵� : " + order.orderID);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.goodsNum);
		System.out.println("��� �ּ� : " + order.address);

	}
	
	

}
