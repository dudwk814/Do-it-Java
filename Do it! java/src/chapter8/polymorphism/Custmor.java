package chapter8.polymorphism;

public class Custmor {

	protected int custimerID;			//고객 아이디
	protected String customerName;	//고객 이름
	protected String customerGrade;	//고객 등급
	public int bonusPoint;					//보너스 포인트
	public double bonusRatio;				//적립 비율
	
	public Custmor() {
		initCustomer();
	}
	
	public Custmor(int custimerID, String customerName) {
		this.custimerID = custimerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	public int getCustimerID() {
		return custimerID;
	}

	public void setCustimerID(int custimerID) {
		this.custimerID = custimerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
