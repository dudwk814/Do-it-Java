package chapter8.inheritance;

public class VIPCustomer extends Custmor{

	private int agentID;	//VIP 고객 상담원 아이디
	double saleRatio;		//할인율
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int coutimerID, String customerName, int agentID) {
		super(coutimerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		//System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}


}
