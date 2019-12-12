package chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("박찬양"));
		hashSet.add(new String("정혜지"));
		hashSet.add(new String("조성혜"));
		hashSet.add(new String("박찬양"));
		
		
		System.out.println(hashSet);
	}

}
