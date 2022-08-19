package class_objects;

import java.util.Scanner;

public class Student {
	
	//Properties
	int studentId;
	String studentName;
	String school;
	
	Scanner scan = new Scanner(System.in);
	
	//Behavior
	
	void acceptInput() {
		System.out.println("Input Student id, Student name and School:");
		studentId = scan.nextInt();
		studentName = scan.next();
		school = scan.next();
	}
	void displayStudentDetails(){
		System.out.println("Student id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student School: "+school);
	}
}
