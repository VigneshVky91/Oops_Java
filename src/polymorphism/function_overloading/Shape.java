package polymorphism.function_overloading;

public class Shape {
	public void findArea(double side){
		System.out.println("Area of square: "+(side*side));
	}
	
	public void findArea(double height, double breadth) {
		System.out.println("Area of Triangle: "+(0.5* breadth*height));
	}
}
