package chapter10.sorting;

public interface Sort {

	void ascendning(int[] arr);
	void descending(int[] arr);
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
