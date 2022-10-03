package static_keyword;

import java.util.Scanner;

public class ClassWithoutObjects {

	private static int empId;
	private static String empName;
	private static String city;
	
	static {
		empId = 1234;
		empName = "Dharsan Frank";
		city = "Trichy";
		
		System.out.println("Static variables initialized...");
	}
	
//	private String dept;
//	private String schoolName;
//	
//	ClassWithoutObjects(){
//		dept = "CSE";
//		schoolName = "JJ";
//	}
//	
	public static void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your id, name and city: ");
		empId = scan.nextInt();
		empName = scan.next();
		city = scan.next();
	}
	
	public static void displayDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(city);
	}
	
	public static void main(String[] args) {
//		getInput();
//		displayDetails();
	}
}
