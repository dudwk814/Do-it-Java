package chapter8.witharraylist;

import chapter8.polymorphism.Custmor;

public class GoldCustomer extends Custmor{
	double saleRatio;
	
	public GoldCustomer(int custimerID, String customerName) {
		super(custimerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
