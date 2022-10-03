package collections_demo.userdefined_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClassToSortUserDefinedTypes {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		
		studentList.add(new Student(178, "Jayashree"));
		studentList.add(new Student(78, "Subha"));
		studentList.add(new Student(18, "Kumar"));
		studentList.add(new Student(17, "Arun"));
		studentList.add(new Student(1, "Joshua"));
		studentList.add(new Student(19, "Jagadeesh"));
		
		System.out.println(studentList);
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
		
//		o1.compareTo(o3);

	}
}
