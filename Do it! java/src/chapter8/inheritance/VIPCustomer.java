package chapter8.inheritance;

public class VIPCustomer extends Custmor{

	private int agentID;	//VIP �� ���� ���̵�
	double saleRatio;		//������
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ��");
//	}
	
	public VIPCustomer(int coutimerID, String customerName, int agentID) {
		super(coutimerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		//System.out.println("VIPCustomer() ������ ȣ��");
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
