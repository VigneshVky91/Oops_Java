package single_inheritance;

public class Parent {
	
	double balance = 100000;
	
	void car() {
		System.out.println("Driving the car");
	}
	
	void spendMoney() {
		System.out.println("Spending money from account balance: "+balance);
	}
}
