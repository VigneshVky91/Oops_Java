package collections_demo.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> myNamesList = new ArrayList<String>();
		
		myNamesList.add("Dharsan");
		myNamesList.add("Mathi");
		myNamesList.add("Shankar");
		myNamesList.add("Jayashree");
		myNamesList.add("Senthil");
		myNamesList.add("Vignesh");
//		myNamesList.add(100); Error as the list only accepts string
		
//		Printing the list directly
//		System.out.println(myNamesList);
		
//		Printing the elements of the loop using regular loop
//		for(int i=0; i< myNamesList.size(); i++) {
//			System.out.println(myNamesList.get(i));
//		}
		
//		Printing the elements of the loop using enhanced for loop
		for(String name: myNamesList) {
			System.out.println(name);
		}
	}
}
