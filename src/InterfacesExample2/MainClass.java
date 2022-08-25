package InterfacesExample2;

public class MainClass {

	public static void main(String[] args) {
		BikeLicense bikeLicense = new Dharsan();
		bikeLicense.applyBikeLLR();
		bikeLicense.bikeDriveEight();
		
		CarLicense carLicense = new Dharsan();
		carLicense.applyCarLLR();
		carLicense.carDriveSlopeTest();
	}
}
