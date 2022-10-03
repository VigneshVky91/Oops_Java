package collections_demo.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void addingList(List<Integer> numsList, String type) {
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			numsList.add(0,i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken for the "+type+" is :"+(endTime - startTime));
	}
	
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		addingList(arrList, "Array List");
		
		List<Integer> linkedList = new LinkedList<>();
		addingList(linkedList, "Linked List");
	}
}
