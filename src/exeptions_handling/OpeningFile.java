package exeptions_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OpeningFile {
	public static void main(String[] args) {
		try {
			FileInputStream fStream  = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
			System.out.println("Successfully opened the file and this is the Next line");
			fStream.read();
			System.out.println("Successfully read the data...");
			Thread.sleep(3000);
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not available for reading...");
		}
		catch(IOException e) {
			System.out.println("Unable to read from the file...");
		}
		catch(InterruptedException e) {
			System.out.println("Unable to sleep the thread...");
		}
		finally {
			System.out.println("This code will execute if there is an exception or not!");
		}
	}
}
