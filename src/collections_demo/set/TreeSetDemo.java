package collections_demo.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		TreeSet<Character> set1 = new TreeSet<>();
		TreeSet<String> set2 = new TreeSet<>();

		
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
		
		set1.add('x');
		set1.add('n');
		set1.add('d');
		set1.add('h');
		set1.add('z');
		set1.add('y');
		set1.add('w');
		set1.add('b');
		set1.add('s');
		set1.add('v');
		
		for(Character i: set1) {
			System.out.println(i);
		}
		
		set2.add("Dharsan");
		set2.add("Mathi");
		set2.add("Arun");
		set2.add("Mani");
		set2.add("Umesh");
		set2.add("Kavya");
		
		
		for(String i: set2) {
			System.out.println(i);
		}
	}
}
