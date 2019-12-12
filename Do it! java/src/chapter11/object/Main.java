package chapter11.object;

class Car{
	String name;
	String company;
	
	public Car(String name, String company) {
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return name + " " + company;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car car = (Car)obj;
			if(this.name == car.name) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}

public class Main {

	public static void main(String[] args) {
//		Car car1 = new Car("아반떼", "현대자동차");
//		Car car2 = car1;
//		Car car3 = new Car("아반떼", "현대자동차");
//		
//		System.out.println(car1.equals(car2));
//		System.out.println(car1.equals(car3));
		
		String str1 = new String("테스트");
		String str2 = new String("테스트");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(str1.equals(str2));
		System.out.println(i1.equals(i2));

	}

}
