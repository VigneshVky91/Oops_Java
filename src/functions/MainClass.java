package functions;

public class MainClass {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.sum();
		calc.difference(200, 100);
//		float product = calc.multiplication();
		System.out.println("Product = "+calc.multiplication());
		System.out.println("Quotient = "+calc.quotient(100, 10));
	}

}
