package chapter8.polymorphism;

public class Custmor {

	protected int custimerID;			//�� ���̵�
	protected String customerName;	//�� �̸�
	protected String customerGrade;	//�� ���
	public int bonusPoint;					//���ʽ� ����Ʈ
	public double bonusRatio;				//���� ����
	
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
		bonusPoint += price * bonusRatio;	//���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
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
