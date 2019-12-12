package chapter14.quiz;

public class PasswordTest {
	String userPW;
	
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PasswordException {
		if(userPW == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�.");
		} else if(userPW.length() <= 5) {
			throw new PasswordException("��й�ȣ�� 5���� �̻����� ���ּ���.");
		} else if(userPW.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڸ� �����ؾ� �մϴ�.");
		};
	}

	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String userPW = null;
		
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		} 
		
		userPW = "abc";
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "abcdefsd";
		try {
			test.setUserPW(userPW);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
