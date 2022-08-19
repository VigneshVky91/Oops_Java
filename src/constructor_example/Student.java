package constructor_example;

import java.util.Scanner;

public class Student {
	//Properties
		int studentId;
		String studentName;
		String school;
		
		Scanner scan = new Scanner(System.in);
		
		Student() {
			System.out.println("Input Student id, Student name and School:");
			studentId = scan.nextInt();
			studentName = scan.next();
			school = scan.next();	
		}
		
		
		Student(int sid, String studentName, String school){
			studentId = sid;
			this.studentName = studentName;
			this.school = school;
		}
		
		Student(int studentId, String studentName){
			this.studentId = studentId;
			this.studentName = studentName;
			System.out.println("Input School");
			school = scan.next();
		}
		
		void displayStudentDetails(){
			System.out.println("Student id: "+studentId);
			System.out.println("Student Name: "+studentName);
			System.out.println("Student School: "+school);
		}
}
