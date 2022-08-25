package abstract_classes_example2;

public abstract class License {
	abstract void applyLLR();
	abstract void driveTest();
	
	void allocateInspector() {
		System.out.println("Allocated Inspector...");
	}
}
