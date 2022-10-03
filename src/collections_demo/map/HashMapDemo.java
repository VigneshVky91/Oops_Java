package collections_demo.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(123, "Mathi");
		map.put(13, "Dharsan");
		map.put(23, "Vijay");
		map.put(1234, "Abhi");
		map.put(135, "Kumar");
		map.put(172, "Vikram");
		
//		To print all the entries of a map
		System.out.println(map);
		
//		To get the value belongs to a particular key in a map
//		System.out.println(map.get(13));
		
//		To get all the keys in a map
		System.out.println(map.keySet());
		
//		To get all the values in a map
		System.out.println(map.values());
	}
}
