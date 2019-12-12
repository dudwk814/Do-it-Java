package chapter6.quiz;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person("ÀÌÁöÇı", 10000);
		Person personKim = new Person("±èÇıÁö", 10000);
		
		Buel buel = new Buel("º°´Ù¹æ");
		personLee.takeBuel(buel);
		personLee.showInfo();
		buel.showInfo();
		
		Kong kong = new Kong("Äá´Ù¹æ");
		personKim.takeKong(kong);
		personKim.showInfo();
		kong.showInfo();

	}

}
