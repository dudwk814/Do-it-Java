package chapter10.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shlefQueue = new BookShelf();
		shlefQueue.enQueue("ลยน้ป๊ธฦ 1");
		shlefQueue.enQueue("ลยน้ป๊ธฦ 2");
		shlefQueue.enQueue("ลยน้ป๊ธฦ 3");
		
		System.out.println(shlefQueue.deQueue());
		System.out.println(shlefQueue.deQueue());
		System.out.println(shlefQueue.deQueue());

	}

}
