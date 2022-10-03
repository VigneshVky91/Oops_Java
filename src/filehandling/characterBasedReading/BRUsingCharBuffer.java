package filehandling.characterBasedReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BRUsingCharBuffer {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\welcome.txt"));
			char []ch = new char[300];
			br.read(ch);
			System.out.println(ch);
		}
		catch(IOException e) {
			System.out.println("File not found...");
		}
		finally {
			try {
				br.close();
			}
			catch(IOException e) {
				
			}
		}
	}
}
