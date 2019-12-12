package chapter13.innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;	//내부 클래스는 외부 클래스없이 생성이 불가능하기 때문에 먼저 내부 클래스 자료형 변수를 선언만 하고 외부 클래스 생성자에서 내부 클래스를 생성
	
	public OutClass() {
		inClass = new InClass();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음. 외부 클래스가 생성되어야하는데 스태틱 내부클래스는 외부 클래스와 상관없이 생성할 수 있기 때문
			System.out.println("InStaticClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
		}
		
	}
	
	class InClass {
		int iNum = 100;
		//static int sInNum = 200; 인스턴스 내부 클래스에 정적 변수 선언 불가능 외부 클래스를 먼저 생성해야 하기 때문에 정적 변수나 정적 메서드는 내부 클래스에서 선언 불가능함.
		
		void inTest() {
			System.out.println("OutClass num = "  + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "  + sNum + "(외부 클래스의 정적 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}
public class InnerTest {

	public static void main(String[] args) {
//		OutClass outClass = new OutClass(); 	//외부 클래스 생성자에서 내부 클래스를 생성하기 때문에 내부 클래스도 같이 만들어짐
//		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//		outClass.usingClass();
		
		
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 인반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		sInClass.sTest();
	}

}
