package InterfacesExample2;

public class Dharsan implements BikeLicense, CarLicense{

	public void applyBikeLLR() {
		System.out.println("Dharsan has applied for bike LLR");
	}
	public void bikeDriveEight() {
		System.out.println("Dharsan has completed Eight test");
	}
	public void applyCarLLR() {
		System.out.println("Dharsan has applied for car LLR");
	}
	public void carDriveSlopeTest() {
		System.out.println("Dharsan has completed car slope test");
	}
}
