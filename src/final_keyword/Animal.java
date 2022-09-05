package final_keyword;

public class Animal {
	public final void sleep() {
		System.out.println("Animal sleeping...");
	}
}


class Lion extends Animal{
	public void sleep() {
		System.out.println("Lion sleeping...");
	}
}