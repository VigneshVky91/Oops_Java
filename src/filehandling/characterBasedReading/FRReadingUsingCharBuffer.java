package filehandling.characterBasedReading;

import java.io.FileReader;
import java.io.IOException;

public class FRReadingUsingCharBuffer {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\Dell\\Desktop\\welcome.txt");
			char[] ch = new char[300];
			fr.read(ch);
			System.out.println(ch);
		}
		catch(IOException e) {
			System.out.println("File not found...");
		}
		finally {
			fr.close();
		}
	}
}
