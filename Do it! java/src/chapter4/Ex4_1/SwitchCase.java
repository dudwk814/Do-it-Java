package chapter4.Ex4_1;

public class SwitchCase {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
			case "Gold" :
				System.out.println("�ݸ޴��Դϴ�.");
				break;
			case "Silver" :
				System.out.println("���޴��Դϴ�.");
				break;
			case "Bronze" :
				System.out.println("���޴��Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
		}

	}

}
