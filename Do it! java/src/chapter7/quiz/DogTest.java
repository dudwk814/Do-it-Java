package chapter7.quiz;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("�����", "�˰�");
		dog[1] = new Dog("�Ƹ�", "�����ڱ�");
		dog[2] = new Dog("����", "ġ�Ϳ�");
		dog[3] = new Dog("����", "�ù�");
		dog[4] = new Dog("�����", "�ڽ���Ʈ");
		
		for(int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		System.out.println(" ==================== ");
		for(Dog d : dog) {
			System.out.println(d.showDogInfo());
		}
		
		

	}

}
