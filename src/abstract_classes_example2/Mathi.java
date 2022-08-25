package abstract_classes_example2;

public class Mathi extends License{

	@Override
	void applyLLR() {
		System.out.println("I have applied for LLR");
	}

	@Override
	void driveTest() {
		System.out.println("I have done with the drive test");
	}
}
