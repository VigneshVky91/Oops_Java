package single_inheritance;

public class MainClass {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.car();
		parent.spendMoney();
		
		Child child = new Child();
		child.car();
		child.spendMoney();
	}
}
