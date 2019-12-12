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
		order.orderDate = "2018년 3월 12일";
		order.name = "홍길순";
		order.goodsNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order.orderNum);
		System.out.println("주문자 아이디 : " + order.orderID);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.name);
		System.out.println("주문 상품 번호 : " + order.goodsNum);
		System.out.println("배송 주소 : " + order.address);

	}
	
	

}
