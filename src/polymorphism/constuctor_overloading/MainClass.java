package polymorphism.constuctor_overloading;

public class MainClass {
	public static void main(String[] args) {
		Hotel order1 = new Hotel();
//		order1.todaySpecial();
		order1.displayOrders();
		
		Hotel order2 = new Hotel("Icecream");
		order2.	displayOrders();
		
		Hotel order3 = new Hotel("Veg meals", "Icecream");
		order3.displayOrders();
	}
}
