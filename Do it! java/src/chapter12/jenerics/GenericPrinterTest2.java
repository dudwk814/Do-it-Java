package chapter12.jenerics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();	//�ڹ� 7���� �����ڿ� ���׸����� ��������
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();	//�ڹ� 7���� �����ڿ� ���׸����� ��������
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
	}

}
