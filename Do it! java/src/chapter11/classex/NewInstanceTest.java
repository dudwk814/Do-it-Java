package chapter11.classex;

public class NewInstanceTest {

	public static void main(String[] args) throws Exception {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass1 = Class.forName("chapter11.classex.Person");
		Person person2 = (Person)pClass1.newInstance();
		System.out.println(person2);

	}

}
