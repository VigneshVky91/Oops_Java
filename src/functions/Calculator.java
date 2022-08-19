package functions;

public class Calculator {
	//Default function
	void sum() {
		int num1=100;
		int num2=200;
		System.out.println("Result = "+(num1+num2));
	}
	
	void difference(int num1, int num2) {
		System.out.println("Difference = "+(num1-num2));
	}
	
	float multiplication() {
		int num1 = 20;
		int num2 = 2;
		return num1*num2;
	}
	
	float quotient(int num1, int num2) {
		return num1/num2;
	}
}
