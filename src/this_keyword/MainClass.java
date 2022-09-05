package this_keyword;

public class MainClass {
	public static void main(String[] args) {
		Car car1 = new Car("Red", "Audi", 4);
		Car car2 = new Car("White", "Honda", 4);

		car1.printDetails();
		car2.printDetails();
	}
}
