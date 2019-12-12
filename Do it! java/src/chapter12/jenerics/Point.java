package chapter12.jenerics;

public class Point<T, V> {
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {	//제네릭 메서드
		return x;
	}

	public V getY() {	//제네릭 메서드
		return y;
	}
	
	

}
