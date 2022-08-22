package access_specifiers.another;

import access_specifiers.demo.Parent;

public class ClassInsideAnotherPackage {
void testPrintingFromAnotherClassInTheDiffPack() {
		
		Parent parent = new Parent();
		System.out.println(parent.facebookId);
		System.out.println(parent.marriageInvitation);
		System.out.println(parent.areaFestival);
		System.out.println(parent.password);
	}
}
