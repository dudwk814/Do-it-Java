package chapter10.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shlefQueue = new BookShelf();
		shlefQueue.enQueue("�¹��� 1");
		shlefQueue.enQueue("�¹��� 2");
		shlefQueue.enQueue("�¹��� 3");
		
		System.out.println(shlefQueue.deQueue());
		System.out.println(shlefQueue.deQueue());
		System.out.println(shlefQueue.deQueue());

	}

}
