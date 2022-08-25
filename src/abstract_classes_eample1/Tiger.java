package abstract_classes_eample1;

public class Tiger extends Animal{
	double claw_size = 4.5;
	String pattern = "Orange with stripes";
	
	@Override
	void eat() {
		System.out.println("Hunt to eat... in the jungle");
	}
	
	@Override
	void sleep() {
		System.out.println("Sleep under the tree... for 12 hours");
	}
	
	@Override
	void huntingStyle() {
		System.out.println("Hide under the bush and hunt alone...");
	}
}
