package chapter9.test;

import java.util.ArrayList;

import chapter9.Avante;
import chapter9.Car;
import chapter9.Genesis;
import chapter9.Grandeur;
import chapter9.Sonata;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car: carList) {
			car.run();
			System.out.println("=======================");
		}

	}

}
