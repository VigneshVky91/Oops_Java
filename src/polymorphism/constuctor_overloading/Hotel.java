package polymorphism.constuctor_overloading;

import java.util.Scanner;

public class Hotel {
	
	//Instance variable
	private String foodName;
	private String addOns;
	Scanner scan = new Scanner(System.in);
	Hotel(){
		
		todaySpecial();
		
		System.out.println("Enter food name and addons:");
		foodName = scan.next();
		addOns = scan.next();
	}
	
	Hotel(String foodName, String addOns){
		this.foodName = foodName;
		this.addOns = addOns;
	}
	
	Hotel(String addOns){
		foodName = "Non veg meals";
		this.addOns = addOns;
	}
	
	public void todaySpecial() {
		
		System.out.println("Main food items:");
		System.out.println("-----------------------");
		
		System.out.println("Biriyani");
		System.out.println("Parotta");
		System.out.println("Uthappam");
		System.out.println("Veg Meals");
		System.out.println("Nonveg meals");
		
		System.out.println("Addons:");
		System.out.println("-----------------------");

		System.out.println("Icecream");
		System.out.println("Juice");
		System.out.println("Soup");
		System.out.println("French fries");
		System.out.println("Chicken fry");
		
	}
	
	public void displayOrders() {
		System.out.println("Your orders:");
		
		System.out.println("Main item: "+foodName);
		System.out.println("Addons: "+addOns);
	}
}
