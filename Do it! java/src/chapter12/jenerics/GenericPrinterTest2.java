package chapter12.jenerics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();	//자바 7부터 생성자에 제네릭형은 생략가능
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();	//자바 7부터 생성자에 제네릭형은 생략가능
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
	}

}
