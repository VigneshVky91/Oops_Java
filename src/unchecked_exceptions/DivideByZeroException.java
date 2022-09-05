package unchecked_exceptions;

import java.util.Scanner;

public class DivideByZeroException {
	public static void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		try {
			float result = num1 / num2;
			System.out.println(result);
		}
		catch(ArithmeticException ae) {
			System.out.println("Can't divide a number...");
		}
	}
}
