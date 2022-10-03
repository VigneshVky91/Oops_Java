package collections_demo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> myNamesList = new LinkedList<>();
		
		myNamesList.add("Dharsan");
		myNamesList.add("Mathi");
		myNamesList.add("Shankar");
		myNamesList.add("Jayashree");
		myNamesList.add("Senthil");
		myNamesList.add("Vignesh");	
		
//		Printing the list directly
//		System.out.println(myNamesList);
		
//		Printing the list using a regular for loop
//		for(int i=0; i<myNamesList.size(); i++) {
//			System.out.println(myNamesList.get(i));
//		}
		
//		Printing the list using enhanced for loop
		for(String n: myNamesList) {
			System.out.println(n);
		}
	}
}
