package exeptions_handling.creating_custom_exceptions;

import java.util.Scanner;

class InvalidInputException extends Exception{
	String message;
	InvalidInputException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
class StudentAlreadyExistsException extends Exception{
	String message;
	StudentAlreadyExistsException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}


public class CustomExceptionMainClass {
	
	public static void insertStudentRecord(int id, String studentName) throws StudentAlreadyExistsException {
		if(id==100) {
			throw new StudentAlreadyExistsException("The record you are trying to insert already exists..");
		}
		else {
			System.out.println("New record inserted successfully...");
		}
	}

	public static String findAStudent() throws InvalidInputException {
		int sid;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the student id: ");
		sid = scan.nextInt();
		
		if(sid == 0) {
			throw new InvalidInputException("Your input is invalid...");
		}
		else {
			return "Student name: Mathi";
		}
	}
	
	public static void main(String[] args) {
		try {
			String studentName = findAStudent();
			System.out.println(studentName);
			insertStudentRecord(101, "Dharsan");
		}
		catch(InvalidInputException ie) {
			System.out.println(ie.getMessage());
		}
		catch(StudentAlreadyExistsException se) {
			System.out.println(se.getMessage());
		}
	}
}
