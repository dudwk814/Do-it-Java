package chapter7.quiz;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("»ï¼øÀÌ", "¶Ë°³"));
		dogList.add(new Dog("¾Æ¸®", "À£½ÃÄÚ±â"));
		dogList.add(new Dog("¶×ÀÌ", "Ä¡¿Í¿Í"));
		dogList.add(new Dog("º°ÀÌ", "½Ã¹Ù"));
		dogList.add(new Dog("Èñ¸ÁÀÌ", "´Ú½ºÈÆÆ®"));
		
		for(int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());
		}
		
		System.out.println();
		System.out.println();
		
		for(Dog dogs : dogList) {
			System.out.println(dogs.showDogInfo());
		}
	}
}
