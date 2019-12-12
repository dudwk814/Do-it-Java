package chapter11.quiz;

class myDog{
	String name;
	String type;
	
	public myDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
public class Q4 {

	public static void main(String[] args) {
		myDog dog = new myDog("∏€∏€¿Ã", "¡¯µæ∞≥");
		System.out.println(dog);

	}

}
