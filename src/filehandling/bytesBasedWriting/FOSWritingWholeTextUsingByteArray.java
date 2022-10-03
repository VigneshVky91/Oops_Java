package filehandling.bytesBasedWriting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSWritingWholeTextUsingByteArray {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		try {
			fos = new FileOutputStream("C:\\Users\\Dell\\Desktop\\file2.txt", true);
			System.out.println("Input any text to be added to the file...");
			String message = scan.nextLine();
			
			fos.write((message+"\n").getBytes());
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
