package overriding;

public class Lion extends Animal{
	public void sleep() {
//		Animal animal = new Animal();
//		animal.sleep();
		super.sleep();
		System.out.println("I am a Lion I sleep extra 8 hours");
	}
	
	public void drinkWater() {
		super.drinkWater();
		System.out.println("Lion drinks 20 litres of water everyday");
	}
}
