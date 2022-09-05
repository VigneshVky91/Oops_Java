package final_keyword;

public final class MathiDataType {
	public void displayMessage() {
		System.out.println("Hello world...");
	}
}

//The following VigneshMessage class can't be extended from MathiDataType as the parent is final
class VigneshMessage extends MathiDataType{
	
}
