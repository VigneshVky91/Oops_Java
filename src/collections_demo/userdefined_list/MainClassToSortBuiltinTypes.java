package collections_demo.userdefined_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClassToSortBuiltinTypes {
	public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		List<Integer> numsList = new LinkedList<>();

		
		myList.add("Animal");
		myList.add("Dolphine");
		myList.add("Buffalo");
		myList.add("Ant");
		myList.add("Cheetah");
		
		numsList.add(35);
		numsList.add(25);
		numsList.add(39);
		numsList.add(45);
		numsList.add(15);
		
		
		
		System.out.println("Unsorted list: ");
		System.out.println(myList);
		
		System.out.println("Sorted list: ");
		Collections.sort(myList);
		System.out.println(myList);
		
		Collections.sort(numsList);
		System.out.println(numsList);

	}
}
