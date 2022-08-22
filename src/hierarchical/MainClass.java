package hierarchical;


public class MainClass {
	public static void main(String[] args) {
		Son suresh = new Son();
		suresh.sonMehtod();
		suresh.parentMethod();
		
		Daughter vidhya = new Daughter();
		vidhya.daughterMehtod();
		vidhya.parentMethod();
	}
}
