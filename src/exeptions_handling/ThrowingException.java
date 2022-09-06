package exeptions_handling;

public class ThrowingException {
	
	public static void checkString(String name) {
		if(name.isEmpty() || name=="") {
//			System.out.println("String is empty");
			throw new NullPointerException();
		}
		else {
			System.out.println("String is valid...");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkString("");
		}
		catch(NullPointerException npe) {
			System.out.println("Your string is empty, Please always pass a valid string...");
		}
	}
}
