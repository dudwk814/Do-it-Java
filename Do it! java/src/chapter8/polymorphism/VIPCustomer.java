package chapter8.polymorphism;

public class VIPCustomer extends Custmor{

	private int agentID;	//VIP 고객 상담원 아이디
	double saleRatio;		//할인율
	

	
	public VIPCustomer(int coutimerID, String customerName, int agentID) {
		super(coutimerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}


}
