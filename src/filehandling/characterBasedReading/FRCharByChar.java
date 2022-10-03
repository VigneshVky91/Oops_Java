package filehandling.characterBasedReading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FRCharByChar {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\Dell\\Desktop\\welcome.txt");
			int ch;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException e) {
			System.out.println("File not found...");
		}
	}
}
