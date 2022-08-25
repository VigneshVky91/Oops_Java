package InterfacesExample1;

public class Mathi implements BuyingAComputer{

	@Override
	public void saveMoney() {
		System.out.println("I have saved money");
	}

	@Override
	public void goToShop() {
		System.out.println("I went to the shop");
	}

	@Override
	public void chooseLaptop() {
		System.out.println("I chose the dell laptop");
	}

	@Override
	public void payMoney() {
		System.out.println("I have paid money to buy the laptop");
	}
	
}
