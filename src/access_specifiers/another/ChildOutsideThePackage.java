package access_specifiers.another;

import access_specifiers.demo.Parent;

public class ChildOutsideThePackage  extends Parent {
void testPrintingFromChildClassInTheDiffPack() {
		
	ChildOutsideThePackage child = new ChildOutsideThePackage();
		System.out.println(child.facebookId);
		System.out.println(child.marriageInvitation);
		System.out.println(child.areaFestival);
		System.out.println(child.password);
	}
}
