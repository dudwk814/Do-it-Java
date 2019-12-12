package chapter11.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		
		StringBuilder builder = new StringBuilder(javaStr);
		System.out.println("������ builder �޸� �ּ� : " + System.identityHashCode(builder));
		
		builder.append(" and");
		builder.append(" android");
		builder.append(" programming is fun!!");
		System.out.println("������ builder �޸� �ּ� : " + System.identityHashCode(builder));
		
		javaStr = builder.toString();
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		
		Integer num = new Integer("150");
	
	}

}
