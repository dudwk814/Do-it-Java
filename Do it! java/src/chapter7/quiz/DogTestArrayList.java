package chapter7.quiz;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("�����", "�˰�"));
		dogList.add(new Dog("�Ƹ�", "�����ڱ�"));
		dogList.add(new Dog("����", "ġ�Ϳ�"));
		dogList.add(new Dog("����", "�ù�"));
		dogList.add(new Dog("�����", "�ڽ���Ʈ"));
		
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
