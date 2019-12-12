package chapter14.quiz;

public class PasswordTest {
	String userPW;
	
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PasswordException {
		if(userPW == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if(userPW.length() <= 5) {
			throw new PasswordException("비밀번호를 5글자 이상으로 해주세요.");
		} else if(userPW.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자를 포함해야 합니다.");
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
