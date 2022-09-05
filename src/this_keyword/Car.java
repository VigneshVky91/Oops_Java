package this_keyword;

public class Car {
	private String color;
	private String brand;
	private int no_of_wheels;
	
	Car(String color, String brand, int no_of_wheels){
		this.color = color;
		this.brand = brand;
		this.no_of_wheels = no_of_wheels;
	}
	
	public void printDetails() {
		System.out.println(color);
		System.out.println(brand);
		System.out.println(no_of_wheels);
	}
}
