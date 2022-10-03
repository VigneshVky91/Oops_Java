package collections_demo.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(23);
		set.add(2);
		set.add(3);
		set.add(234);
		set.add(123);
		set.add(253);
		set.add(1);
		set.add(7);
		set.add(1);
		set.add(7);
		
		for(Integer i: set) {
			System.out.println(i);
		}
	}
}
