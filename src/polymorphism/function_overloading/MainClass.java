package polymorphism.function_overloading;

public class MainClass {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		shape.findArea(5);
		shape.findArea(5,5);
	}
}
