package chapter6.quiz;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person("������", 10000);
		Person personKim = new Person("������", 10000);
		
		Buel buel = new Buel("���ٹ�");
		personLee.takeBuel(buel);
		personLee.showInfo();
		buel.showInfo();
		
		Kong kong = new Kong("��ٹ�");
		personKim.takeKong(kong);
		personKim.showInfo();
		kong.showInfo();

	}

}
