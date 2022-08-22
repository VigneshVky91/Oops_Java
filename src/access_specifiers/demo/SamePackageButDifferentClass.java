package access_specifiers.demo;

public class SamePackageButDifferentClass {
	void testPrintingFromAnotherClassInTheSamePack() {
		
		Parent parent = new Parent();
		System.out.println(parent.facebookId);
		System.out.println(parent.marriageInvitation);
		System.out.println(parent.areaFestival);
		System.out.println(parent.password);
	}
}
