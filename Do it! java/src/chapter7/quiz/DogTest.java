package chapter7.quiz;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("삼순이", "똥개");
		dog[1] = new Dog("아리", "웰시코기");
		dog[2] = new Dog("뚱이", "치와와");
		dog[3] = new Dog("별이", "시바");
		dog[4] = new Dog("희망이", "닥스훈트");
		
		for(int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println(" ==================== ");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
		
		

	}

}
