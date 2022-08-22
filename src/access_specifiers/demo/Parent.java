package access_specifiers.demo;

public class Parent {
	//public can be accessed by any class in the same package and outside package
	public String facebookId="vignesh112233";
	//protected can be accessed by any class in the same package 
	protected String marriageInvitation = "Marriage invitation";
	//default can be accessed by any class in the same package
	String areaFestival = "Our area festival";
	//private variables can't be accessed outside the class
	private String password = "12345";
	
	void testPrintingFromTheSameClass() {
		System.out.println(facebookId);
		System.out.println(marriageInvitation);
		System.out.println(areaFestival);
		System.out.println(password);
	}
}
