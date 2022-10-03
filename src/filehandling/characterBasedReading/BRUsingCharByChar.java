package filehandling.characterBasedReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BRUsingCharByChar {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\welcome.txt"));
			int ch;
			while((ch=br.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException e) {
			System.out.println("File not found...");
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
