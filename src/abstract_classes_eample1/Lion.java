package abstract_classes_eample1;

public class Lion extends Animal{
	double claw_size = 3.5;
	String color = "Reddish brown";
	String furType = "Heavy Furr around the entire face";

	@Override
	void eat() {
		System.out.println("Hunt to eat in the Savannah...");
	}
	
	@Override
	void sleep() {
		System.out.println("Sleep under the tree... for 16 hours");
	}
	
	@Override
	void huntingStyle() {
		System.out.println("Hunt in groups...");
	}
	
	
	void designation() {
		System.out.println("I am the kind of the jungle...");
	}
}
