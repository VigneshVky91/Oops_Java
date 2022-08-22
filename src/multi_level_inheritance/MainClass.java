package multi_level_inheritance;

public class MainClass {

	public static void main(String[] args) {
		
//		Father can access only his properties
		Father father = new Father();
		father.accessFatherHouse();
		
//		Child can access father's property as well as his properties
		Child child = new Child();
		child.accessFatherHouse();
		child.accessChildHouse();
		
		GrandChild grandChild = new GrandChild();
		grandChild.accessFatherHouse();
		grandChild.accessChildHouse();
		grandChild.accessGrandChildHouse();
	}
}
