package chapter6.singleton;

public class Car {

	private static int carNUm = 10000;
	private int carNum;
	
	public Car() {
		carNUm++;
		carNum = carNUm;
	}

	public  int getCarNum() {
		return carNum;
	}

	public  void setCarNum(int carNUm) {
		this.carNum = carNUm;
	}
	
	
	
	
	
	
}
