package abstract_classes_eample1;

public class MainClass {
	public static void main(String[] args) {
		Animal lion = new Lion();
		
		lion.eat();
		lion.sleep();
		lion.huntingStyle();
		lion.lookForWater();
		
		Animal tiger = new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.huntingStyle();
		tiger.lookForWater();
	}
}
